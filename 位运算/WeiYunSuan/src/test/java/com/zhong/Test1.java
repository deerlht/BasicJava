package com.zhong;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Test1 {
    @Test
    public void swap(){
        int a = 61;
        int b = 3;
        int temp = a^b;
        a = temp ^ a;
        b = temp ^ b;
        Assert.assertEquals(3, a);
        Assert.assertEquals(61, b);
   }

   @Test
    public void swap2(){
        int a = 61;
        int b = 3;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
       Assert.assertEquals(3, a);
       Assert.assertEquals(61, b);
   }

   @Test
    public void t1(){
       // 1、左移( << )
       // 0000 0000 0000 0000 0000 0000 0000 0101 然后左移2位后，低位补0：//
       // 0000 0000 0000 0000 0000 0000 0001 0100 换算成10进制为20
       System.out.println(5 << 2);// 运行结果是20

       // 2、右移( >> ) 高位补符号位
       // 0000 0000 0000 0000 0000 0000 0000 0101 然后右移2位，高位补0：
       // 0000 0000 0000 0000 0000 0000 0000 0001
       System.out.println(5 >> 2);// 运行结果是1
   }

   @Test
    public void t2(){
       // 3、无符号右移( >>> ) 高位补0
       // 例如 -5换算成二进制后为：0101 取反加1为1011
       // 1111 1111 1111 1111 1111 1111 1111 1011
       // 我们分别对5进行右移3位、 -5进行右移3位和无符号右移3位：
       System.out.println(5 >> 3);// 结果是0
       System.out.println(-5 >> 3);// 结果是-1
       System.out.println(-5 >>> 3);// 结果是536870911
   }

   @Test
    public void t3(){
       // 4、位与( & )
       // 位与：第一个操作数的的第n位于第二个操作数的第n位如果都是1，那么结果的第n为也为1，否则为0
       System.out.println(5 & 3);// 结果为1
       System.out.println(4 & 1);// 结果为0

       // 5、位或( | )
       // 第一个操作数的的第n位于第二个操作数的第n位 只要有一个是1，那么结果的第n为也为1，否则为0
       System.out.println(5 | 3);// 结果为7

       // 6、位异或( ^ )
       // 第一个操作数的的第n位于第二个操作数的第n位 相反，那么结果的第n为也为1，否则为0
       System.out.println(5 ^ 3);//结果为6

       // 7、位非( ~ )
       // 操作数的第n位为1，那么结果的第n位为0，反之。
       System.out.println(~5);// 结果为-6
   }
}
