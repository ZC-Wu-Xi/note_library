### 前言

Java中的JDK动态代理是一种通过反射机制生成代理对象的技术，使得我们能够在运行时动态地创建某个接口的代理类，而无需手动编写实现类。JDK动态代理通常用于横切关注点（如日志、事务管理、安全性等）在方法调用前后进行处理，而不需要修改目标类的源代码。

### 一、JDK动态代理

#### 1. 创建代理类及返回代理对象

JDK动态代理通过`java.lang.reflect.Proxy`类的静态方法`newProxyInstance`来创建代理类并返回代理类对象，其方法签名如下：

```java
static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
```

- **loader**：类加载器，指定类加载器是为了精确地定位类。
- **interfaces**：接口的Class类数组。使用JDK的反射实现动态代理必须要有接口，因为生成的代理需要实现这些接口，这样生成的代理类对象才能转化为代理目标的接口对象，进而根据接口中的方法调用处理器中的`invoke`方法。
- **h**：`InvocationHandler`类型，它是每个代理类对应的处理器。

#### 2. InvocationHandler

`InvocationHandler`是每个代理类对应的处理器，它定义了一个`invoke`方法，其签名如下：

```java
Object invoke(Object proxy, Method method, Object[] args)
```

- **Object**：方法调用的返回值，该返回值可以作为被代理的方法调用的返回值。
- **proxy**：代理类对象。
- **method**：目标类中被代理的方法。
- **args**：目标类中被代理的方法的运行参数。 

![在这里插入图片描述](/assets/JDK动态代理、Cglib动态代理及Spring AOPImg/c950d9c50207ee6c862bb63a90cc0f29.png)

#### 3. JDK动态代理的不足

在JDK中使用动态代理，必须有类的接口。因为生成的代理需要实现这个接口，这样我们生成的代理类对象才能转化为代理目标的接口对象，然后根据接口中的方法，调用处理器中`invoke`方法。

------

### 二、Cglib动态代理

（一）**概述**

 为了弥补JDK动态代理的不足，第三方组织封装了一套工具包，即Cglib的工具包。这套包不基于接口，而是基于父子继承，通过重写的形式扩展方法，并且这个子类工具是自动生成的。 CGLIB（Code Generation Library）是一个强大的字节码生成库，常用于在运行时动态生成某个类的子类，实现方法拦截等功能。与JDK动态代理不同，CGLIB是通过继承目标类来创建代理对象的，因此它不要求目标类实现接口，适用于没有实现接口的类。 CGLIB动态代理的基本原理是：通过字节码技术，在运行时生成目标类的子类，并重写其中的方法（即拦截方法的调用）。

#### 1. 主要特点

- **目标类不需要实现接口**：CGLIB可以对没有实现接口的类进行代理，而JDK动态代理只能代理实现了接口的类。
- **通过继承的方式创建代理类**：CGLIB通过继承目标类并重写其中的方法来实现动态代理，因此代理类是目标类的子类。
- **性能比JDK动态代理高**：虽然JDK代理适用于接口，但CGLIB通过字节码修改直接在目标类基础上生成代理对象，相对更高效。

#### 2. CGLIB代理的使用

CGLIB代理是通过继承目标类并在其方法上添加拦截逻辑来实现的。CGLIB的核心类是 `Enhancer`，它用于创建代理对象。

**步骤**

**1. 添加CGLIB依赖**：在项目中需要添加CGLIB的依赖，如果使用Maven管理项目，可以在`pom.xml`中添加如下依赖：

```xml
<dependency>
    <groupId>cglib</groupId>
    <artifactId>cglib</artifactId>
    <version>3.3.0</version>  <!-- 使用最新版本 -->
</dependency>
```

**2. 创建目标类**：CGLIB代理是通过继承目标类来实现的，因此目标类不需要实现接口。

```java
public class HelloService {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}
```

**3. 创建 `MethodInterceptor` 实现类**：`MethodInterceptor` 接口用于拦截目标类的方法调用。

```java
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class HelloServiceInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, java.lang.reflect.Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Before method call: " + method.getName());
        Object result = proxy.invokeSuper(obj, args);  // 调用父类方法（目标类方法）
        System.out.println("After method call: " + method.getName());
        return result;
    }
}
```

**4. 创建代理对象**：使用 `Enhancer` 创建目标类的代理对象。

```java
import org.springframework.cglib.proxy.Enhancer;

public class CglibProxyTest {
    public static void main(String[] args) {
        // 创建目标对象
        HelloService helloService = new HelloService();

        // 创建CGLIB代理
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloService.class);  // 设置目标类
        enhancer.setCallback(new HelloServiceInterceptor());  // 设置拦截器

        // 创建代理对象
        HelloService proxy = (HelloService) enhancer.create();

        // 调用代理对象的方法
        proxy.sayHello("World");
    }
}
```

输出结果

```java
Before method call: sayHello
Hello, World
After method call: sayHello
```

#### 3. 关键类和方法

1. Enhancer：CGLIB的核心类，通过它可以生成代理对象。 

   - `setSuperclass(Class)`：设置代理类的父类。
   - `setCallback(MethodInterceptor)`：设置拦截器，它会在调用目标方法时拦截并执行自定义逻辑。
   - `create()`：创建代理对象。
   
2.  **MethodInterceptor**：这是CGLIB的拦截器接口，`intercept()`方法会在代理对象的方法被调用时执行。在 `intercept()` 中，通常会调用 `MethodProxy.invokeSuper()` 来调用目标类的实际方法。 

3.  **MethodProxy**：CGLIB提供的工具类，`invokeSuper()` 方法用于执行父类（目标类）的方法。 

#### 4. 与JDK动态代理的对比

- **代理方式不同**：JDK动态代理是基于接口的，而CGLIB基于类继承。
- **目标类要求**：JDK动态代理要求目标类实现接口，而CGLIB不需要目标类实现接口，可以代理没有接口的类。
- **性能**：CGLIB由于使用继承的方式创建代理对象，相较于JDK动态代理可能稍微高效一些，但由于是通过字节码生成，所以性能开销也不能忽视。
- **限制**：CGLIB不能代理 `final` 类和 `final` 方法，因为CGLIB是通过继承和覆盖父类的方法来实现的，`final` 修饰符会阻止方法的重写。

#### 5. 应用场景

- **没有接口的类**：当目标类没有实现接口时，JDK动态代理无法使用，这时CGLIB是一个好的选择。
- **性能要求较高**：CGLIB代理创建代理类的方式比JDK代理更直接，通常性能较好，适合对性能有要求的场景。

------

### 三、Spring的AOP

#### 1. 基于动态代理模式实现

Spring的AOP就是基于动态代理模式实现的。它对上述的动态代理代码进行了封装，封装后我们只需要对需要关注的部分进行代码编写，并通过配置的方式完成指定目标的方法增强。同时，也可以通过注解方式来完成AOP操作。

#### 2. AOP相关术语

1.  **Target（目标对象）** 代理的目标对象，也就是我们最终要对其方法进行增强操作的原始对象。 
2.  **Proxy（代理）** 一个类被AOP织入增强后，就会产生一个结果代理类，这个代理类包含了对目标对象方法增强后的逻辑。 
3.  **Joinpoint（连接点）** 所谓连接点是指那些被拦截到的点。在Spring中，这些点指的是方法，因为Spring只支持方法类型的连接点。 
4.  **Pointcut（切入点）** 所谓切入点是指我们要对哪些Joinpoint进行拦截的定义，通过特定的表达式来明确需要拦截的方法集合。 
5.  **Advice（通知/增强）** 所谓通知是指拦截到Joinpoint之后所要做的事情，比如在方法调用前、调用后执行特定的逻辑等。 
6.  **Aspect（切面）** 是切入点和通知（引介）的结合，它完整地定义了在哪些点对目标对象进行何种增强操作。 
7.  **Weaving（织入）** 是指把增强应用到目标对象来创建新的代理对象的过程。Spring采用动态代理织入，而AspectJ采用编译期织入和类装载期织入。 

#### 3. AOP的实现方式

**1. AspectJ方式**

- 告诉Spring哪些方法需要形成切面可以通过表达式来指定，例如：

```java
expression="execution(* cn.icss.service.*.*(..))"
```

其表达式语法如下：

```java
execution([修饰符] 返回值类型 包名.类名.方法名(参数))
```

- 访问修饰符可以省略。
- 返回值类型、包名、类名、方法名可以使用星号`*`代表任意。
- 包名与类名之间一个点`.`代表当前包下的类，两个点`..`表示当前包及其子包下的类。
- 参数列表可以使用两个点`..`表示任意个数，任意类型的参数列表。

例如：

```js
execution(public void com.icss.aop.Target.method())
execution(void com.icss.aop.Target.*(..))
execution(* com.icss.aop.*.*(..))
execution(* com.icss.aop..*.*(..))
execution(* *..*.*(..))
```

**AspectJ方式实现AOP的缺点**：需要我们实现特定的接口和抽象类才能实现AOP操作。

**Pojo/Entity方式** Pojo方式把前置、后置、环绕以及异常通知写在了同一个类中，且这个类不需要继承或者实现任何的接口或者抽象类。 **实现办法** 导入依赖，编写相应的配置与注解，实现AOP增强功能。 

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-aop</artifactId>
    <version>5.3.23</version>
</dependency>
<!--导入spring aop织入的依赖-->
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.6</version>
</dependency>
```

新建一个类在这个类中写方法即可 

```java
public class Aspectj1 {
    public void before(){
        System.out.println("这是前置通知");
    }
    public void after(){
        System.out.println("这是后置通知");
    }

    /**
     * 指定参数
     */
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前的。。。。。");
        Object result = proceedingJoinPoint.proceed();
        System.out.println("环绕后");
        return result;
    }
    public void myExc(Exception e) throws Throwable{
        System.out.println("这是异常通知");
    }
}
```

配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context
                           http://www.springframework.org/schema/context/spring-context.xsd
                           http://www.springframework.org/schema/aop
                           http://www.springframework.org/schema/aop/spring-aop.xsd
                           ">
    <bean id="userService" class="cn.icss.service.impl.UserServiceImpl"></bean>
    <!--  将before纳入容器进行管理-->
    <bean id="before" class="cn.icss.aspect1.MyBefore"></bean>
    <bean id="after" class="cn.icss.aspect1.MyAfter"></bean>
    <bean id="around1" class="cn.icss.aspect1.MyAround"></bean>
    <bean id="aspectj1" class="cn.icss.aspect1.Aspectj1"></bean>
    <aop:config>
        <aop:aspect ref="aspectj1">
            <!--            配置切点-->
            <aop:pointcut id="mypoint" expression="execution(* cn.icss.service.*.*(..))"/>
            <!--            <aop:before method="before" pointcut-ref="mypoint"></aop:before>-->
            <!--            <aop:after method="after" pointcut-ref="mypoint"></aop:after>-->
            <!--            <aop:around method="around" pointcut-ref="mypoint"></aop:around>-->
            <!--            配置异常通知的时候需要在目标方法产生异常并且在配置的时候配置 throwing 值是方法的形式参数的名字-->
            <aop:after-throwing method="myExc" pointcut-ref="mypoint" throwing="e"></aop:after-throwing>
        </aop:aspect>
    </aop:config>
</beans>
```

核心方法 

```java
public class UserServiceImpl implements UserService {
    @Override
    public void hello(){
        System.oUt.println("这个是原有的业务方法")；
            int i= 1/0;
    }
}
```

 测试方法不变 

```java
public class Test1 {
    public static void main(String[]args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserServiceuserService = (UserService)context.getBean("userService");
        userservice.hello();
    }
}
```

### 结语

以下是对 JDK 动态代理、Cglib 动态代理和 Spring AOP 的总结，帮助理解它们的特点、区别及适用场景： **JDK 动态代理**

- 特点

  - 只能代理实现了接口的类或对象。
  - 在运行时动态生成代理类，避免了手动创建静态代理类的繁琐。
  - 使用简单，适用于代理接口的场景。
  
- **应用场景**：适合需要对接口进行动态代理的场景，如一些简单的业务逻辑。 **Cglib 动态代理**

- 特点

  - 能代理没有实现接口的类。
  - 性能比 JDK 动态代理更高（尤其是在大批量代理时）。
  - 无法代理 `final` 类或方法（因为无法继承它们）。
  
- **应用场景**：适合需要代理普通类的场景，尤其是需要性能优化时。

**Spring AOP**

- **基本概念**：Spring AOP（面向切面编程）是 Spring 提供的一种模块化功能，基于动态代理或静态织入机制实现横切关注点的分离。

- 特点

  - **基于 JDK 动态代理**：用于代理实现了接口的类。
  - **基于 Cglib 动态代理**：用于代理未实现接口的类。
  - 提供声明式的 AOP 编程方式，支持定义切面、切点和通知（如前置、后置、异常处理等）。
  - 配合 Spring 的 IOC [容器](https://cloud.tencent.com/product/tke?from_column=20065&from=20065)使用，能够无缝集成到项目中。
  
- **应用场景**：用于日志记录、安全控制、事务管理等场景，适合对横切关注点进行模块化处理。

**三者的对比**

| 特性         | JDK 动态代理                 | Cglib 动态代理                     | Spring AOP            |
| :----------- | :--------------------------- | :--------------------------------- | :-------------------- |
| 代理对象要求 | 必须实现接口                 | 不需要实现接口                     | 自动选择 JDK 或 Cglib |
| 实现方式     | 基于 java.lang.reflect.Proxy | 基于字节码生成子类                 | 基于 JDK 或 Cglib     |
| 性能         | 性能较低（多用于小规模代理） | 性能较高（适合大规模代理）         | 随代理方式变化        |
| 灵活性       | 有接口限制                   | 能代理所有普通类，但不能代理 final | 灵活可配置            |
| 典型用途     | 简单动态代理                 | 普通类的动态代理                   | 面向切面的编程        |
