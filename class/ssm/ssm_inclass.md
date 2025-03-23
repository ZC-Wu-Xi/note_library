# SpringIOCDI

## bean

- 在Spring中，构成应用程序主干并由Spring loC容器管理的对象称为bean
- bean是一个由Spring loC容器实例化、组装和管理的对象。
- 在Spring框架之下，bean类是通过Spring核心配置文件管理，一
  般将其命名为`applicationContext..xml`

### bean的装配

#### `<bean>`配置

- `<beans>`标签：描述Spring核心配置文件约束。
- `<bean>`标签：声明bean对象。
  - `id`属性：声明bean的id,该id在整个配置文件中唯一。
  - `class`属性：声明该bean的class对象类型，输入值为类的完整
    路径
  - **`property`子标签：为该bean所给定的属性注入值**

#### 基于xml的bean装配

- 基于set方法注入
- 基于有参构造方法注入

javaBean：

```java
public class HelloSpring {
    public void print() {
        System.out.println("HelloSpring的print方法被调用了");
    }
}
```

```java
public class WuZhaoCheng {
    HelloSpring helloSpring;

    // 通过set方法注入
    public void setHelloSpring(HelloSpring helloSpring) {
        this.helloSpring = helloSpring;
    }

    public void print() {
        System.out.println("WuZhaoCheng的print方法执行了");
    }

    public void printHelloSpring() {
        helloSpring.print();
    }
}
```

`applicationContext.xml`：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id="helloBean" class="com.xi.ssm.bean.HelloSpring"></bean>
    <bean id="wuzhaocheng" class="com.xi.ssm.bean.WuZhaoCheng">
        <property name="helloSpring" ref="helloBean"></property>
    </bean>
</beans>
```

测试被spring容器管理的javabean：

```java
public class TestWuZhaoCheng {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        WuZhaoCheng wzc = (WuZhaoCheng) context.getBean("wuzhaocheng");
        wzc.print();
        wzc.printHelloSpring();
    }
}
```

#### 基于注解的bean装配

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd
">
    <!--    使用context命名空间，开启注解处理器-->
        <context:annotation-config/>
    <!--    使用context命名空间，配置包扫描-->
        <context:component-scan base-package="com.xi.yanshi"/>
    
</beans>
```

```java
@Component
public class HelloHuaYu {
    public void print() {
        System.out.println("hello HuaYu");
    }
}
```

```java
public class TestHelloHuaYu {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloHuaYu helloHuaYu = (HelloHuaYu) context.getBean("helloHuaYu");
        helloHuaYu.print();
    }
}
```
