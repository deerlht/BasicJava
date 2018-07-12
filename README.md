# BasicJava
重新开始，细扣JAVA

## hashCode

## + 和 StringBuilder的区别

使用+连接字符串：

1. 将非字符串对象转化为StringBuilder对象
2. 将上面生成的StringBuilder对象append到之前的StringBuilder对象中
3. 调用StringBuilder的toString方法

造成的结果：
1. 执行效率低
2. 增加了GC的压力