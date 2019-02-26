# BasicJava

重新开始，细扣JAVA

## 构造一个对象的步骤

父类静态代码块 》 子类静态代码块 》 父类构造代码块 》 子类构造代码块 》 父类构造函数 》 子类构造函数

1. 静态代码块：在类的加载过程中第三步初始化的时候进行的，主要目的是给类变量赋予初始值

2. 构造代码块：是独立的，必须依附载体才能运行，Java会把构造代码块放在每种构造函数的前面，用于实例化一些共有的实例变量，减少代码量

3. 构造函数：用于实例化变量

## hashCode

1. 返回该对象的哈希值

2. 属于Object的方法，因为每一个类都继承自Object，所以每一个类都有hashCode方法

3. 同一个类的不同对象的hashCode得到的结果是不同的

4. 在程序运行的过程中，同一个对象的hashCode得到的结果是相同的

## 使用 + 来连接字符串  和 使用StringBuilder的区别

使用+连接字符串：

1. 将非字符串对象转化为StringBuilder对象

2. 将上面生成的StringBuilder对象append到之前的StringBuilder对象中

3. 调用StringBuilder的toString方法

造成的结果：

1. 执行效率低

2. 增加了GC的压力

## 获得项目目录

下面的代码

1. 不论在main函数还是在测试用例中

2. 不论在windows还是在linux中 

都能使用

```java
String rootDir = System.getProperty("user.dir").replace("\\", "/");
System.out.println(rootDir);
```

## 获得一个文件夹下的所有文件

使用递归的写法：

```java
    /**
     * 该方法获得某个文件夹下的所有的文件
     *
     * @param directoryName
     *         文件夹的路径
     * @param files
     *         作为返回值，该文件夹下的所有文件
     */
    public static void listf(String directoryName, ArrayList<File> files) {
        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile()) {
                files.add(file);
            } else if (file.isDirectory()) {
                listf(file.getAbsolutePath(), files);
            }
        }
    }
```
