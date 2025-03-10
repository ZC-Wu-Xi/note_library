---
author: 汐
mail: 1302344595@qq.com
---

> 该笔记由chatgpt生成，可能有不对的地方

## 数据类型包装类

### Integer 封装整数类型

**介绍：**？？？

**特点：**？？？

**使用场景**：？？？

**静态方法：(生成时若没有静态方法：则省略)：**

| 方法 | 结构(格式: 返回值 参数1 参数2...) | 功能 | 示例 |
| ---- | --------------------------------- | ---- | ---- |
|      |                                   |      |      |

**非静态方法：(生成时若没有非静态方法：则省略)：**

| 方法 | 结构(格式: 返回值 参数1 参数2...) | 功能 | 示例 |
| ---- | --------------------------------- | ---- | ---- |
|      |                                   |      |      |

**jdk包含的操作Integer的工具类：**

- 类名，包名
- 类名，包名

**第三方的一些常用工具类：**

- 类名：描述
- 类名：描述

### Double 封装双精度浮点型

**介绍：**？？？

**特点：**？？？

**使用场景**：？？？

...

### StringBuilde

# aaa

## 1. 数据类型包装类

| 包装类      | 对应基本数据类型 | 说明                                     |
| :---------- | :--------------- | :--------------------------------------- |
| `Integer`   | `int`            | 封装整数类型，提供基本的操作和转换方法。 |
| `Double`    | `double`         | 封装双精度浮点型，提供操作和格式化功能。 |
| `Character` | `char`           | 封装字符类型，提供与字符相关的功能。     |
| `Boolean`   | `boolean`        | 封装布尔类型，表示真假值。               |
| `Long`      | `long`           | 封装长整型，适用于大数值的处理。         |
| `Float`     | `float`          | 封装单精度浮点型，提供基本的操作和转换。 |
| `Short`     | `short`          | 封装短整型，适用于小范围整数。           |
| `Byte`      | `byte`           | 封装字节类型，适用于小范围的数据。       |

### Integer 封装整数类型

**介绍：**

- `Integer` 是 Java 的基本数据类型 **`int` 的包装类**，用于将整数封装为对象，以便在需要对象的情况下使用，比如集合中。

**特点：**

- 提供了对 `int` 类型的对象表示。
- 支持基本类型与对象之间的自动装箱和拆箱。
- 提供静态常量，如 `MAX_VALUE` 和 `MIN_VALUE`。
- 支持字符串与整数之间的转换方法。

**使用场景**：

- 适用于需要将**整数作为对象处理**的场景，如在集合中存储数字、进行数值计算时需要封装类型等。

**静态方法：**

| 方法        | 结构                        | 功能                                | 示例                                    |
| :---------- | :-------------------------- | :---------------------------------- | :-------------------------------------- |
| `parseInt`  | `int parseInt(String s)`    | 将字符串**转**换**为整数**          | `int value = Integer.parseInt("123");`  |
| `valueOf`   | `Integer valueOf(String s)` | 将字符串**转**换**为 Integer** 对象 | `Integer obj = Integer.valueOf("123");` |
| `MAX_VALUE` | `int MAX_VALUE()`           | 返回 `int` 类型的**最大值**         | `int max = Integer.MAX_VALUE;`          |
| `MIN_VALUE` | `int MIN_VALUE()`           | 返回 `int` 类型的**最小值**         | `int min = Integer.MIN_VALUE;`          |

**非静态方法：**

| 方法       | 结构             | 功能                                     | 示例                          |
| :--------- | :--------------- | :--------------------------------------- | :---------------------------- |
| `intValue` | `int intValue()` | **返回** Integer 对象的**原始 `int` 值** | `int value = obj.intValue();` |

**jdk包含的操作Integer的工具类：**

- **`java.lang.Integer`**
- **`java.util.Arrays`**（可用于处理 `Integer` 数组）

**第三方的一些常用工具类：**

- **Apache Commons Lang - `NumberUtils`**：数字相关的实用方法。
- **Google Guava - `Ints`**：提供对 `int` 和 `Integer` 的基本操作方法。

------

### Double 封装双精度浮点型

**介绍：**

- `Double` 是 Java 的基本数据类型 `double` 的包装类，用于将双精度浮点数封装为对象。

**特点：**

- 提供了对 `double` 类型的对象表示。
- 支持基本类型与对象之间的自动装箱和拆箱。
- 包含静态常量 `MAX_VALUE` 和 `MIN_VALUE`。
- 提供字符串与双精度浮点数之间的转换方法。

**使用场景**：

- 适用于需要将**浮点数作为对象**处理的场景，如在集合中存储小数、进行高精度数值运算等。

**静态方法：**

| 方法          | 结构(格式: 返回值 参数1 参数2...) | 功能                               | 示例                                           |
| :------------ | :-------------------------------- | :--------------------------------- | :--------------------------------------------- |
| `parseDouble` | `double parseDouble(String s)`    | 将字符串**转**换为**双精度浮点数** | `double value = Double.parseDouble("123.45");` |
| `valueOf`     | `Double valueOf(String s)`        | 将字符串**转**换为 **Double 对象** | `Double obj = Double.valueOf("123.45");`       |
| `MAX_VALUE`   | `double MAX_VALUE()`              | 返回 `double` 类型的**最大值**     | `double max = Double.MAX_VALUE;`               |
| `MIN_VALUE`   | `double MIN_VALUE()`              | 返回 `double` 类型的**最小值**     | `double min = Double.MIN_VALUE;`               |

**非静态方法：**

| 方法          | 结构(格式: 返回值 参数1 参数2...) | 功能                               | 示例                                |
| :------------ | :-------------------------------- | :--------------------------------- | :---------------------------------- |
| `doubleValue` | `double doubleValue()`            | 返回 Double 对象的原始 `double` 值 | `double value = obj.doubleValue();` |

**jdk包含的操作Double的工具类：**

- **`java.lang.Double`**
- **`java.util.Arrays`**（可用于处理 `Double` 数组）

**第三方的一些常用工具类：**

- **Apache Commons Lang - `NumberUtils`**：数字相关的实用方法。
- **Google Guava - `Doubles`**：提供对 `double` 和 `Double` 的基本操作方法。

------

### Character 封装字符类型

**介绍：**

- `Character` 是 Java 中 `char` 的包装类，用于将字符封装为对象，以便在需要对象的情况下使用，如集合操作等。

**特点：**

- 提供 `char` 类型的对象表示。
- 支持基本类型与对象之间的自动装箱和拆箱。
- 提供静态方法：来检查字符类型（如字母、数字、大写、小写等）。
- 提供字符与 `int` 之间的转换方法。

**使用场景**：

- 适用于需要将**字符作为对象**处理的场景，如在集合中存储字符、字符类型判断等。

**静态方法：**

| 方法          | 结构                        | 功能                   | 示例                                        |
| ------------- | --------------------------- | ---------------------- | ------------------------------------------- |
| `isDigit`     | `boolean isDigit(char ch)`  | 判断字符是否为**数字** | `boolean result = Character.isDigit('9');`  |
| `isLetter`    | `boolean isLetter(char ch)` | 判断字符是否为**字母** | `boolean result = Character.isLetter('A');` |
| `toUpperCase` | `char toUpperCase(char ch)` | **转换**为**大写字符** | `char upper = Character.toUpperCase('a');`  |
| `toLowerCase` | `char toLowerCase(char ch)` | **转换**为**小写字符** | `char lower = Character.toLowerCase('A');`  |

**非静态方法：**

| 方法        | 结构               | 功能                                  | 示例                            |
| ----------- | ------------------ | ------------------------------------- | ------------------------------- |
| `charValue` | `char charValue()` | 返回 `Character` 对象的原始 `char` 值 | `char value = obj.charValue();` |

**jdk包含的操作 Character 的工具类：**

- **`java.lang.Character`**

------

### Boolean 封装布尔类型

**介绍：**

- `Boolean` 是 `boolean` 的包装类，用于将布尔值封装为对象。

**特点：**

- 提供 `boolean` 类型的对象表示。
- 支持基本类型与对象之间的自动装箱和拆箱。
- 只包含 `true` 和 `false` 两个值。

**使用场景**：

- 适用于需要将**布尔值作为对象**存储和传递的场景，如集合操作或与泛型配合使用等。

**静态方法：**

| 方法           | 结构                             | 功能                              | 示例                                            |
| -------------- | -------------------------------- | --------------------------------- | ----------------------------------------------- |
| `parseBoolean` | `boolean parseBoolean(String s)` | **解析**字符串并返回 `boolean` 值 | `boolean value = Boolean.parseBoolean("true");` |
| `valueOf`      | `Boolean valueOf(String s)`      | **将字符串**转换为 `Boolean` 对象 | `Boolean obj = Boolean.valueOf("true");`        |

**非静态方法：**

| 方法           | 结构                     | 功能                                   | 示例                                  |
| -------------- | ------------------------ | -------------------------------------- | ------------------------------------- |
| `booleanValue` | `boolean booleanValue()` | 返回 `Boolean` 对象的原始 `boolean` 值 | `boolean value = obj.booleanValue();` |

**jdk包含的操作 Boolean 的工具类：**

- **`java.lang.Boolean`**

**第三方的一些常用工具类：**

- **Apache Commons Lang - `BooleanUtils`**：提供 `Boolean` 类型转换的工具方法。

**第三方的一些常用工具类：**

- **Apache Commons Lang - `BooleanUtils`**：布尔值相关的实用方法。

------

### Long 封装长整型

**介绍：**

- `Long` 是 `long` 类型的包装类，用于将长整数封装为对象。

**特点：**

- 提供 `long` 类型的对象表示。
- 支持基本类型与对象之间的自动装箱和拆箱。
- 包含静态常量 `MAX_VALUE` 和 `MIN_VALUE`。
- 提供字符串与长整数之间的转换方法。

**使用场景**：

- 适用于需要将**长整数作为对象**处理的场景，如集合存储、数值计算等。

**静态方法：**

| 方法        | 结构                       | 功能                           | 示例                                     |
| ----------- | -------------------------- | ------------------------------ | ---------------------------------------- |
| `parseLong` | `long parseLong(String s)` | **解析**字符串并返回 `long` 值 | `long value = Long.parseLong("123456");` |
| `valueOf`   | `Long valueOf(String s)`   | **将字符串**转换为 `Long` 对象 | `Long obj = Long.valueOf("123456");`     |
| `MAX_VALUE` | `long MAX_VALUE`           | 返回 `long` 类型的**最大值**   | `long max = Long.MAX_VALUE;`             |
| `MIN_VALUE` | `long MIN_VALUE`           | 返回 `long` 类型的**最小值**   | `long min = Long.MIN_VALUE;`             |

**非静态方法：**

| 方法        | 结构               | 功能                             | 示例                            |
| ----------- | ------------------ | -------------------------------- | ------------------------------- |
| `longValue` | `long longValue()` | 返回 `Long` 对象的原始 `long` 值 | `long value = obj.longValue();` |

**jdk包含的操作 Long 的工具类：**

- **`java.lang.Long`**
- **`java.util.Arrays`**（可用于 `Long` 数组）

**第三方的一些常用工具类：**

- **Apache Commons Lang - `NumberUtils`**：数字相关的实用方法。
- **Google Guava - `Longs`**：提供 `long` 和 `Long` 的基本操作方法。

### **Float 封装单精度浮点型**

**介绍：**

- `Float` 是 Java 基本数据类型 `float` 的包装类，用于将单精度浮点数封装为对象。

**特点：**

- 提供了 `float` 类型的对象表示。
- 支持基本类型与对象之间的 **自动装箱和拆箱**。
- 包含静态常量 `MAX_VALUE` 和 `MIN_VALUE`，表示 `float` 的最大值和最小值。
- 提供字符串与浮点数之间的转换方法，如 `parseFloat` 和 `valueOf`。

**使用场景：**

- 适用于 **存储小数**，但不要求高精度计算的场景，如 **游戏中的坐标计算**。
- **集合框架**（如 `List<Float>`）中存储 `float` 类型的值。

**静态方法：**

| 方法         | 结构                         | 功能                            | 示例                                       |
| ------------ | ---------------------------- | ------------------------------- | ------------------------------------------ |
| `parseFloat` | `float parseFloat(String s)` | 将字符串**转换为** `float` 值   | `float value = Float.parseFloat("12.34");` |
| `valueOf`    | `Float valueOf(String s)`    | 将字符串**转换为** `Float` 对象 | `Float obj = Float.valueOf("12.34");`      |
| `MAX_VALUE`  | `float MAX_VALUE`            | 返回 `float` 类型的**最大值**   | `float max = Float.MAX_VALUE;`             |
| `MIN_VALUE`  | `float MIN_VALUE`            | 返回 `float` 类型的**最小值**   | `float min = Float.MIN_VALUE;`             |

**非静态方法：**

| 方法         | 结构                 | 功能                               | 示例                              |
| ------------ | -------------------- | ---------------------------------- | --------------------------------- |
| `floatValue` | `float floatValue()` | **返回** `Float` 对象的 `float` 值 | `float value = obj.floatValue();` |

**JDK 相关工具类：**

- **`java.lang.Float`**
- **`java.util.Arrays`**（可用于处理 `Float` 数组）

**第三方常用工具类：**

- **Apache Commons Lang - `NumberUtils`**
- **Google Guava - `Floats`**

------

### **Short 封装短整型**

**介绍：**

- `Short` 是 Java 基本数据类型 `short` 的包装类，用于将 `short` 类型封装为对象。

**特点：**

- 提供了 `short` 类型的对象表示。
- 支持基本类型与对象之间的 **自动装箱和拆箱**。
- 包含静态常量 `MAX_VALUE` 和 `MIN_VALUE`，表示 `short` 的最大值和最小值。
- 提供字符串与 `short` 类型之间的转换方法，如 `parseShort` 和 `valueOf`。

**使用场景：**

- 适用于 **内存有限的场景**，如 **网络通信、文件存储**，比 `int` 省空间。
- **集合框架**（如 `List<Short>`）中存储 `short` 类型的值。

**静态方法：**

| 方法         | 结构                         | 功能                            | 示例                                     |
| ------------ | ---------------------------- | ------------------------------- | ---------------------------------------- |
| `parseShort` | `short parseShort(String s)` | 将字符串**转换为** `short` 值   | `short value = Short.parseShort("123");` |
| `valueOf`    | `Short valueOf(String s)`    | 将字符串**转换为** `Short` 对象 | `Short obj = Short.valueOf("123");`      |
| `MAX_VALUE`  | `short MAX_VALUE`            | 返回 `short` 类型的**最大值**   | `short max = Short.MAX_VALUE;`           |
| `MIN_VALUE`  | `short MIN_VALUE`            | 返回 `short` 类型的**最小值**   | `short min = Short.MIN_VALUE;`           |

**非静态方法：**

| 方法         | 结构                 | 功能                               | 示例                              |
| ------------ | -------------------- | ---------------------------------- | --------------------------------- |
| `shortValue` | `short shortValue()` | **返回** `Short` 对象的 `short` 值 | `short value = obj.shortValue();` |

**JDK 相关工具类：**

- **`java.lang.Short`**
- **`java.util.Arrays`**（可用于处理 `Short` 数组）

**第三方常用工具类：**

- **Apache Commons Lang - `NumberUtils`**
- **Google Guava - `Shorts`**

------

### **Byte 封装字节型**

**介绍：**

- `Byte` 是 Java 基本数据类型 `byte` 的包装类，用于将 `byte` 类型封装为对象。

**特点：**

- 提供了 `byte` 类型的对象表示。
- 支持基本类型与对象之间的 **自动装箱和拆箱**。
- 包含静态常量 `MAX_VALUE` 和 `MIN_VALUE`，表示 `byte` 的最大值和最小值。
- 提供字符串与 `byte` 类型之间的转换方法，如 `parseByte` 和 `valueOf`。

**使用场景：**

- **优化内存使用**，`byte` 只占 **1 个字节（8 bit）**，适用于存储 **小范围整数** 的场景，如 **文件流、网络协议、图片处理等**。
- **集合框架**（如 `List<Byte>`）中存储 `byte` 类型的值。

**静态方法：**

| 方法        | 结构                       | 功能                           | 示例                                  |
| ----------- | -------------------------- | ------------------------------ | ------------------------------------- |
| `parseByte` | `byte parseByte(String s)` | 将字符串**转换为** `byte` 值   | `byte value = Byte.parseByte("100");` |
| `valueOf`   | `Byte valueOf(String s)`   | 将字符串**转换为** `Byte` 对象 | `Byte obj = Byte.valueOf("100");`     |
| `MAX_VALUE` | `byte MAX_VALUE`           | 返回 `byte` 类型的**最大值**   | `byte max = Byte.MAX_VALUE;`          |
| `MIN_VALUE` | `byte MIN_VALUE`           | 返回 `byte` 类型的**最小值**   | `byte min = Byte.MIN_VALUE;`          |

**非静态方法：**

| 方法        | 结构               | 功能                             | 示例                            |
| ----------- | ------------------ | -------------------------------- | ------------------------------- |
| `byteValue` | `byte byteValue()` | **返回** `Byte` 对象的 `byte` 值 | `byte value = obj.byteValue();` |

**JDK 相关工具类：**

- **`java.lang.Byte`**
- **`java.util.Arrays`**（可用于处理 `Byte` 数组）

**第三方常用工具类：**

- **Apache Commons Lang - `NumberUtils`**
- **Google Guava - `Bytes`**

## 2. 字符串处理类

- **`String`**：不可变的字符串类。
- **`StringBuilder`**：可变字符序列，适合频繁修改字符串。
- **`StringBuffer`**：线程安全的可变字符序列。

### **String 不可变的字符串类**

**介绍：**

- `String` 是 Java 提供的 **不可变** 字符串类，一旦创建，**内容不可更改**。
- 底层使用 **`char[]`（JDK 8 及之前）或 `byte[]`（JDK 9 及之后）** 存储字符。
- **存储于字符串常量池**，相同内容的字符串可**共享内存**，减少重复对象的创建，提高效率。

**特点：**

- **不可变性（Immutable）：** 任何修改 `String` 内容的操作都会**返回一个新的 `String` 对象**，原对象不变。
- **字符串常量池（String Pool）：** 相同的字符串字面量**只存储一份**，避免重复创建对象。
- **支持 `+` 连接操作：** 底层会优化为 `StringBuilder`，但**不推荐在循环中使用 `+` 连接字符串**，应使用 `StringBuilder` 或 `StringBuffer`。

**使用场景：**

- **适用于字符串内容不变**的场景，如 **配置信息、日志输出、数据库查询语句** 等。
- **适用于字符串共享**的场景，减少内存开销。

**静态方法：**

| 方法               | 结构                                                         | 功能                               | 示例                                                         |
| ------------------ | ------------------------------------------------------------ | ---------------------------------- | ------------------------------------------------------------ |
| `valueOf`          | `static String valueOf(基本类型/对象)`                       | **将基本类型或对象转换为字符串**   | `String str = String.valueOf(123);`                          |
| `format`           | `static String format(String format, Object... args)`        | **格式化字符串**（类似 `printf`）  | `String formatted = String.format("%.2f", 3.1415);`          |
| `join`             | `static String join(CharSequence delimiter, CharSequence... elements)` | **使用分隔符连接字符串**           | `String joined = String.join(", ", "A", "B", "C");`          |
| `copyValueOf`      | `static String copyValueOf(char[] data)`                     | **复制字符数组，转换为字符串**     | `String str = String.copyValueOf(new char[]{'H','i'});`      |
| `equalsIgnoreCase` | `static boolean equalsIgnoreCase(String str1, String str2)`  | **比较两个字符串（忽略大小写）**   | `boolean isEqual = String.equalsIgnoreCase("hello", "HELLO");` |
| `compareTo`        | `static int compareTo(String str1, String str2)`             | **比较两个字符串的大小（字典序）** | `int result = String.compareTo("apple", "banana");`          |

**常用方法：**

| 方法               | 结构                                                         | 功能                                 | 示例                                               |
| ------------------ | ------------------------------------------------------------ | ------------------------------------ | -------------------------------------------------- |
| `length`           | `int length()`                                               | **获取**字符串的**长度**             | `int len = str.length();`                          |
| `charAt`           | `char charAt(int index)`                                     | **获取**指定索引位置的**字符**       | `char c = str.charAt(0);`                          |
| `substring`        | `String substring(int beginIndex, int endIndex)`             | **截取**子字符串                     | `String sub = str.substring(0, 3);`                |
| `indexOf`          | `int indexOf(String s)`                                      | **查找**子字符串**首次出现**的位置   | `int index = str.indexOf("abc");`                  |
| `replace`          | `String replace(CharSequence target, CharSequence replacement)` | **替换**字符串中的**字符或子字符串** | `String newStr = str.replace("a", "b");`           |
| `split`            | `String[] split(String regex)`                               | **拆分**字符串                       | `String[] parts = str.split(",");`                 |
| `equals`           | `boolean equals(Object obj)`                                 | **比较**字符串**内容是否相等**       | `boolean isEqual = str.equals("hello");`           |
| `equalsIgnoreCase` | `boolean equalsIgnoreCase(String anotherString)`             | **忽略大小写比较**                   | `boolean isEqual = str.equalsIgnoreCase("HELLO");` |
| `toLowerCase`      | `String toLowerCase()`                                       | **转换**为**小写**                   | `String lower = str.toLowerCase();`                |
| `toUpperCase`      | `String toUpperCase()`                                       | **转换**为**大写**                   | `String upper = str.toUpperCase();`                |
| `trim`             | `String trim()`                                              | **去除**首尾的**空格**               | `String trimmed = str.trim();`                     |

------

### **StringBuilder 可变字符序列，适合频繁修改字符串**

**介绍：**

- `StringBuilder` 是 **可变的字符序列**，适用于 **频繁修改字符串** 的场景。
- **不保证线程安全**，但**性能较高**。
- **底层基于 `char[]` 数组**，初始容量为 `16`，超出容量后会**动态扩容**。

**常用方法：**

| 方法             | 结构                                                  | 功能                         | 示例                       |
| ---------------- | ----------------------------------------------------- | ---------------------------- | -------------------------- |
| `append`         | `StringBuilder append(String s)`                      | **追加**字符串               | `sb.append("world");`      |
| `insert`         | `StringBuilder insert(int offset, String s)`          | **在指定位置插入**字符串     | `sb.insert(5, "hello");`   |
| `delete`         | `StringBuilder delete(int start, int end)`            | **删除**指定范围内的字符     | `sb.delete(0, 3);`         |
| `replace`        | `StringBuilder replace(int start, int end, String s)` | **替换**指定范围内的字符     | `sb.replace(0, 3, "hi");`  |
| `reverse`        | `StringBuilder reverse()`                             | **反转**字符串               | `sb.reverse();`            |
| `capacity`       | `int capacity()`                                      | **获取**当前**容量**         | `int cap = sb.capacity();` |
| `ensureCapacity` | `void ensureCapacity(int minCapacity)`                | **预分配**容量以减少扩容开销 | `sb.ensureCapacity(50);`   |

------

### **StringBuffer 线程安全的可变字符序列**

**介绍：**

- `StringBuffer` 与 `StringBuilder` **功能类似**，但 **线程安全**，适用于**多线程环境**。
- **底层采用 `synchronized` 关键字保证同步，性能略低于 `StringBuilder`**。

**常用方法：**

| 方法             | 结构                                                 | 功能                         | 示例                       |
| ---------------- | ---------------------------------------------------- | ---------------------------- | -------------------------- |
| `append`         | `StringBuffer append(String s)`                      | **追加**字符串               | `sb.append("world");`      |
| `insert`         | `StringBuffer insert(int offset, String s)`          | **在指定位置插入**字符串     | `sb.insert(5, "hello");`   |
| `delete`         | `StringBuffer delete(int start, int end)`            | **删除**指定范围内的字符     | `sb.delete(0, 3);`         |
| `replace`        | `StringBuffer replace(int start, int end, String s)` | **替换**指定范围内的字符     | `sb.replace(0, 3, "hi");`  |
| `reverse`        | `StringBuffer reverse()`                             | **反转**字符串               | `sb.reverse();`            |
| `capacity`       | `int capacity()`                                     | **获取**当前**容量**         | `int cap = sb.capacity();` |
| `ensureCapacity` | `void ensureCapacity(int minCapacity)`               | **预分配**容量以减少扩容开销 | `sb.ensureCapacity(50);`   |

------

### **其他 String 相关类**

| 类名                            | 作用说明                                                     |
| ------------------------------- | ------------------------------------------------------------ |
| **`java.util.StringTokenizer`** | **旧版的字符串分割类**，**不推荐使用**，建议使用 `split()` 或 `Pattern`。 |
| **`java.util.regex.Pattern`**   | **正则表达式处理类**，用于**复杂字符串匹配和拆分**。         |
| **`java.lang.StringJoiner`**    | **处理字符串连接操作**，支持**分隔符、自定义前后缀**，适用于 `join` 操作。 |

## 3. 容器类（集合框架）

- **List**
  - **`ArrayList`**：动态数组实现。
  - **`LinkedList`**：链表实现。
- **Set**
  - **`HashSet`**：无序、不重复的集合。
  - **`TreeSet`**：有序、不重复的集合。
- **Map**
  - **`HashMap`**：基于哈希表的键值对实现。
  - **`TreeMap`**：基于红黑树的有序键值对实现。

## 4. 输入/输出类

- **`File`**：表示文件和目录的抽象路径。
- **`FileInputStream`** 和 **`FileOutputStream`**：用于读取和写入文件的字节流。
- **`FileReader`** 和 **`FileWriter`**：用于读取和写入文件的字符流。
- **`BufferedReader`** 和 **`BufferedWriter`**：用于高效读取和写入文本数据的缓冲流。
- **`PrintWriter`**：用于格式化输出的打印流。

## 5. 日期和时间类

> ✅ **`LocalDate`、`LocalTime`、`LocalDateTime`、`ZonedDateTime`**：新日期 API，**不可变**，**线程安全**，推荐使用。
> ✅ **`Date`、`Calendar`**：旧版日期 API，**可变**，**线程不安全**，主要用于**旧代码兼容**。

- **`LocalDate`**：表示日期（不含时间）的类。
- **`LocalTime`**：表示时间（不含日期）的类。
- **`LocalDateTime`**：表示日期和时间的组合。
- **`ZonedDateTime`**：表示带时区的日期和时间。
- **`Date`**：表示具体的瞬间。
- **`Calendar`**：用于操作和格式化日期和时间的类。

### **LocalDate - 表示日期（不含时间）的类**

**介绍：**

- `LocalDate` 表示 **年月日**，不包含**时、分、秒**。
- **不可变**，线程安全，基于 `ISO-8601` 日历系统。
- 默认格式为 **`yyyy-MM-dd`**（例如 `2025-02-15`）。

**使用场景：**

- 适用于仅关注**日期**（而非时间）的情况，如**生日、节假日、会议日期**等。

**静态方法：**

| 方法    | 结构                                                       | 功能                                        | 示例                                              |
| ------- | ---------------------------------------------------------- | ------------------------------------------- | ------------------------------------------------- |
| `now`   | `static LocalDate now()`                                   | **获取**当前日期                            | `LocalDate today = LocalDate.now();`              |
| `of`    | `static LocalDate of(int year, int month, int dayOfMonth)` | **创建**指定日期的 `LocalDate` 实例         | `LocalDate date = LocalDate.of(2025, 2, 15);`     |
| `parse` | `static LocalDate parse(CharSequence text)`                | **解析**日期字符串（默认格式 `yyyy-MM-dd`） | `LocalDate date = LocalDate.parse("2025-02-15");` |

**实例方法：**

| 方法            | 结构                                 | 功能                                    | 示例                                       |
| --------------- | ------------------------------------ | --------------------------------------- | ------------------------------------------ |
| `getYear`       | `int getYear()`                      | **获取**年份                            | `int year = date.getYear();`               |
| `getMonth`      | `Month getMonth()`                   | **获取**月份（返回 `Month` 枚举）       | `Month month = date.getMonth();`           |
| `getDayOfMonth` | `int getDayOfMonth()`                | **获取**当月的**日期**                  | `int day = date.getDayOfMonth();`          |
| `getDayOfWeek`  | `DayOfWeek getDayOfWeek()`           | **获取**星期几（返回 `DayOfWeek` 枚举） | `DayOfWeek day = date.getDayOfWeek();`     |
| `plusDays`      | `LocalDate plusDays(long days)`      | **增加**指定天数                        | `LocalDate newDate = date.plusDays(5);`    |
| `minusMonths`   | `LocalDate minusMonths(long months)` | **减少**指定月份                        | `LocalDate newDate = date.minusMonths(1);` |
| `isLeapYear`    | `boolean isLeapYear()`               | **判断**是否是**闰年**                  | `boolean leap = date.isLeapYear();`        |

### **LocalTime - 表示时间（不含日期）的类**

**介绍：**

- `LocalTime` 仅包含**时、分、秒、纳秒**，不包含日期。
- **不可变**，线程安全。
- 默认格式为 **`HH:mm:ss.SSS`**（例如 `14:30:15.123`）。

**使用场景：**

- 适用于仅关注**时间**的情况，如**闹钟、时间戳、每日定时任务**等。

**静态方法：**

| 方法    | 结构                                                    | 功能                                      | 示例                                            |
| ------- | ------------------------------------------------------- | ----------------------------------------- | ----------------------------------------------- |
| `now`   | `static LocalTime now()`                                | **获取**当前时间                          | `LocalTime now = LocalTime.now();`              |
| `of`    | `static LocalTime of(int hour, int minute, int second)` | **创建**指定时间的 `LocalTime` 对象       | `LocalTime time = LocalTime.of(14, 30, 15);`    |
| `parse` | `static LocalTime parse(CharSequence text)`             | **解析**时间字符串（默认格式 `HH:mm:ss`） | `LocalTime time = LocalTime.parse("14:30:15");` |

**实例方法：**

| 方法           | 结构                                   | 功能               | 示例                                         |
| -------------- | -------------------------------------- | ------------------ | -------------------------------------------- |
| `getHour`      | `int getHour()`                        | **获取**小时       | `int hour = time.getHour();`                 |
| `getMinute`    | `int getMinute()`                      | **获取**分钟       | `int minute = time.getMinute();`             |
| `getSecond`    | `int getSecond()`                      | **获取**秒         | `int second = time.getSecond();`             |
| `plusHours`    | `LocalTime plusHours(long hours)`      | **增加**指定小时数 | `LocalTime newTime = time.plusHours(2);`     |
| `minusMinutes` | `LocalTime minusMinutes(long minutes)` | **减少**指定分钟数 | `LocalTime newTime = time.minusMinutes(10);` |

### **LocalDateTime - 表示日期和时间的组合**

**介绍：**

- `LocalDateTime` 组合了 `LocalDate` 和 `LocalTime`，表示完整的**日期+时间**。
- **不可变**，线程安全。
- 默认格式为 **`yyyy-MM-dd'T'HH:mm:ss.SSS`**（例如 `2025-02-15T14:30:15.123`）。

**使用场景：**

- 适用于需要同时存储**日期和时间**的场景，如**日志记录、订单时间、事件时间戳**等。

**静态方法：**

| 方法    | 结构                                                         | 功能                                                       | 示例                                                         |
| ------- | ------------------------------------------------------------ | ---------------------------------------------------------- | ------------------------------------------------------------ |
| `now`   | `static LocalDateTime now()`                                 | **获取**当前日期时间                                       | `LocalDateTime now = LocalDateTime.now();`                   |
| `of`    | `static LocalDateTime of(int year, int month, int day, int hour, int minute, int second)` | **创建**指定日期时间                                       | `LocalDateTime dt = LocalDateTime.of(2025, 2, 15, 14, 30, 15);` |
| `parse` | `static LocalDateTime parse(CharSequence text)`              | **解析**日期时间字符串（默认格式 `yyyy-MM-dd'T'HH:mm:ss`） | `LocalDateTime dt = LocalDateTime.parse("2025-02-15T14:30:15");` |

**实例方法：**

| 方法          | 结构                                   | 功能                   | 示例                                      |
| ------------- | -------------------------------------- | ---------------------- | ----------------------------------------- |
| `toLocalDate` | `LocalDate toLocalDate()`              | **转换**为 `LocalDate` | `LocalDate date = dt.toLocalDate();`      |
| `toLocalTime` | `LocalTime toLocalTime()`              | **转换**为 `LocalTime` | `LocalTime time = dt.toLocalTime();`      |
| `plusDays`    | `LocalDateTime plusDays(long days)`    | **增加**指定天数       | `LocalDateTime newDt = dt.plusDays(3);`   |
| `minusHours`  | `LocalDateTime minusHours(long hours)` | **减少**指定小时数     | `LocalDateTime newDt = dt.minusHours(2);` |

### **ZonedDateTime - 表示带时区的日期和时间**

**介绍：**

- `ZonedDateTime` 代表**日期 + 时间 + 时区**的信息。
- **不可变**，线程安全，基于 `ISO-8601` 标准。
- 适用于跨时区应用，如**全球会议安排、航班时间、服务器时间同步**等。
- 默认格式为 **`yyyy-MM-dd'T'HH:mm:ss.SSSZ[ZoneId]`**（例如 `2025-02-15T14:30:15.123+08:00[Asia/Shanghai]`）。

**静态方法：**

| 方法    | 结构                                                         | 功能                                                         | 示例                                                         |
| ------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `now`   | `static ZonedDateTime now()`                                 | **获取**当前系统时区的日期时间                               | `ZonedDateTime now = ZonedDateTime.now();`                   |
| `now`   | `static ZonedDateTime now(ZoneId zone)`                      | **获取**指定时区的当前日期时间                               | `ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));` |
| `of`    | `static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zone)` | **创建**带时区的 `ZonedDateTime`                             | `ZonedDateTime dt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Tokyo"));` |
| `parse` | `static ZonedDateTime parse(CharSequence text)`              | **解析**日期时间字符串（格式 `yyyy-MM-dd'T'HH:mm:ssXXX[ZoneId]`） | `ZonedDateTime dt = ZonedDateTime.parse("2025-02-15T14:30:15+08:00[Asia/Shanghai]");` |

**实例方法**

| 方法                  | 结构                                             | 功能                                   | 示例                                                         |
| --------------------- | ------------------------------------------------ | -------------------------------------- | ------------------------------------------------------------ |
| `getZone`             | `ZoneId getZone()`                               | **获取**时区                           | `ZoneId zone = dt.getZone();`                                |
| `withZoneSameInstant` | `ZonedDateTime withZoneSameInstant(ZoneId zone)` | **转换**到指定时区（保持时间点不变）   | `ZonedDateTime nyTime = dt.withZoneSameInstant(ZoneId.of("America/New_York"));` |
| `toLocalDateTime`     | `LocalDateTime toLocalDateTime()`                | **转换**为 `LocalDateTime`（去除时区） | `LocalDateTime localDt = dt.toLocalDateTime();`              |

### **Date - 表示具体的瞬间（旧版日期类）**

**介绍：**

- `Date` 代表**时间戳**（从 1970 年 1 月 1 日 00:00:00 GMT 以来的毫秒数）。
- **可变**，**线程不安全**，多数方法已被 `java.time` 替代。
- 适用于**与旧代码兼容**的场景，如数据库操作（JDBC）。

**构造方法（Constructors）**

| 构造方法          | 结构                     | 功能                           | 示例                                        |
| ----------------- | ------------------------ | ------------------------------ | ------------------------------------------- |
| `Date()`          | `public Date()`          | **创建**当前时间的 `Date` 对象 | `Date now = new Date();`                    |
| `Date(long time)` | `public Date(long time)` | **使用**时间戳创建 `Date` 对象 | `Date specific = new Date(1707993600000L);` |

**实例方法**

| 方法      | 结构                        | 功能                           | 示例                                          |
| --------- | --------------------------- | ------------------------------ | --------------------------------------------- |
| `getTime` | `long getTime()`            | **获取**自 1970 年的**毫秒数** | `long millis = date.getTime();`               |
| `setTime` | `void setTime(long time)`   | **设置**时间（修改时间戳）     | `date.setTime(1707993600000L);`               |
| `before`  | `boolean before(Date when)` | **判断**是否早于指定时间       | `boolean isBefore = date.before(new Date());` |
| `after`   | `boolean after(Date when)`  | **判断**是否晚于指定时间       | `boolean isAfter = date.after(new Date());`   |

### **Calendar - 用于操作和格式化日期和时间的类**

**介绍：**

- `Calendar` 是 `Date` 的**增强版**，可进行日期运算，如**加减天数、获取年月日信息**等。
- **可变**，**线程不安全**，`java.time` 取代了大部分功能。
- 适用于**旧代码兼容**，如处理 `Date`。

**静态方法：**

| 方法          | 结构                            | 功能                               | 示例                                     |
| ------------- | ------------------------------- | ---------------------------------- | ---------------------------------------- |
| `getInstance` | `static Calendar getInstance()` | **获取**当前时间的 `Calendar` 实例 | `Calendar cal = Calendar.getInstance();` |

**实例方法**

| 方法      | 结构                              | 功能                       | 示例                                       |
| --------- | --------------------------------- | -------------------------- | ------------------------------------------ |
| `get`     | `int get(int field)`              | **获取**指定字段的值       | `int year = cal.get(Calendar.YEAR);`       |
| `set`     | `void set(int field, int value)`  | **设置**指定字段的值       | `cal.set(Calendar.MONTH, Calendar.MARCH);` |
| `add`     | `void add(int field, int amount)` | **对指定字段加减**一定数值 | `cal.add(Calendar.DAY_OF_MONTH, 5);`       |
| `getTime` | `Date getTime()`                  | **获取**对应的 `Date` 对象 | `Date date = cal.getTime();`               |
| `setTime` | `void setTime(Date date)`         | **设置** `Calendar` 的时间 | `cal.setTime(new Date());`                 |

## 6. 网络类

- **`Socket`**：用于实现客户端与服务器之间的通信。
- **`ServerSocket`**：用于在服务器端接收客户端的请求。
- **`URL`**：表示网络资源的统一资源定位符。
- **`HttpURLConnection`**：用于发送 HTTP 请求的类。

## 7. 线程和并发类

- **`Thread`**：表示一个线程。
- **`Runnable`**：表示可以被线程执行的任务。
- **`ExecutorService`**：用于管理异步任务的线程池。
- **`CountDownLatch`**：用于同步多个线程的执行。
- **`Semaphore`**：用于控制对共享资源的访问。

## 8. 异常处理类

- **`Exception`**：所有异常的超类。
- **`RuntimeException`**：运行时异常的超类。
- **`IOException`**：输入输出异常。
- **`NullPointerException`**：空指针异常。

## 9. 工具类

- **`Math`**：提供基本的数学运算。
- **`Random`**：生成伪随机数。
- **`Arrays`**：用于数组操作的工具类。
- **`Collections`**：用于集合操作的工具类。

## 10. 反射类

- **`Class`**：用于反射的类，表示类的运行时描述。
- **`Method`**：表示类的方法。
- **`Field`**：表示类的属性。
- **`Constructor`**：表示类的构造函数。