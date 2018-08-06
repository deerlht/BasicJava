![TestCase和TestSuite](imgs/TestCase和TestSuite.png)

1. TestSuite和TestCase都是实现了Test接口
2. TestSuite的建立和使用依赖于TestCase实例
3. TestCase继承自Assert类，因此TestCase中可以直接使用Assert中的相关方法

# TestDemo.java


```java
package com.zhong;
import junit.framework.TestCase;
public class TestDemo extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("setUp , hashCode = " + hashCode());
    }

    public void testMethod1() {
        System.out.println("testMethod1 , hashCode = " + hashCode());
    }

    public void testMethod2() {
        System.out.println("testMethod2 , hashCode = " + hashCode());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("tearDown , hashCode = " + hashCode());
    }
}
```

执行顺序如下图所示：

![TestCase和TestSuite_2](imgs/TestCase和TestSuite_2.png)


1. 对于我们类中的两个测试用例testMethod1和testMethod2，都会分别创建一个新的TestCase子类对象（注意hashCode()获得的值不一样）

2. 对于我们类中的两个测试用例testMethod1和testMethod2，都会引起TestCase中的setUp和tearDown函数分别执行一遍

3. 可以在setUp当中进行一些初始化操作（如类的某些属性的赋值操作）

4. 可以在tearDown中进行一些扫尾工作（如类中某些对象所持有资源的释放）


对于测试用例testMethod1和testMethod2的函数声明，在我们书写用例函数的时候需要注意他们有一个共同的特点：

1. 访问权限都是public；

2. 返回类型都是void;

3. 没有参数；

4. 方法名以“test”开头。


# TestSuiteDemo.java

```java
package com.zhong;
import junit.framework.Test;
import junit.framework.TestSuite;
public class TestSuiteDemo extends TestSuite {
    public static Test suite() {
        //创建TestSuite对象
        TestSuite suite = new TestSuite();
        //为TestSuite添加一个测试用例集合，参数为：Classtest Class
        //通过参数可以知道，其实该参数就是TestCase的子类
        suite.addTestSuite(TestDemo.class);
        //创建具体的测试用例
        Test test = TestSuite.createTest(TestDemo.class, "testMethod1");
        //添加一个具体的测试用例
        suite.addTest(test);
        return suite;
    }
}
```

1. 在测试时，会首先创建TestSuite对象。

2. 在TestSuite对象的构造方法中，会扫描TestCase子类的所有方法，并调用addTestMethod方法，在该方法中调用isPublicTestMethod方法判断是否是待测的方法，若是会调用createTest方法，创建一个Test对象，并调用addTest方法加入到自己的集合中去


3. 在执行过程中的TestCase子类都会以具体的test方法个数创建自身实例的个数

