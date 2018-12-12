package com.zhong;

import org.junit.Test;

public class Test2 {
    @Test
    public void t1(){
        byte b = 0x13;
        int res = b >> 2;
        System.out.println(res);
    }
}
