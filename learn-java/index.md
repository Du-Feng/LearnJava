# [Home](https://du-feng.github.io/)

# learn-java

# Lambda and Stream
Java 8 中的重要语言特性，二者结合使用，会让代码更简洁。

## Lambda
Lambda 的写法：
- (参数) -> 表达式
- (参数) -> { 语句；}

Lambda 代替 interface 的示例：

         new Thread(() -> { System.out.println("Hell World"); }).start();
         
## Stream
Stream 可以按流操作一个集合，里面的操作，用 lambda 写会十分简洁。
Stream 的常用操作：
- forEach: 参数为 T，没有返回值的 action。
- filter: 参数为 T，返回值为 boolean 的表达式，只有结果为 true 时才会进入下一步。
- map: 参数为 T，返回值也为 T，用于加工数据。可以使用 lambda，或者method名字：
  - .map(c -> c.copyCustomer())
  - .map(Customer::copyCustomer)
- flatMap
- collect: 将上一步产生的结果，重新收集为一个集合，取决于 Collectors.toList() 方法：
  - Collectors.toList()
  - Collectors.toMap()()
