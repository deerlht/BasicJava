package com.zhong;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void t1(){
        System.out.println(String.format("%2s",Byte.SIZE)+" bits");
        System.out.println(Short.SIZE+" bits");
        System.out.println(Integer.SIZE+" bits");
        System.out.println(Long.SIZE+" bits");
        System.out.println(Float.SIZE+" bits");
        System.out.println(Double.SIZE+" bits");
        System.out.println(Character.SIZE+" bits");
    }

    @Test
    public void t2() throws InterruptedException {
        byte b;
        System.out.println(b);
    }
}
