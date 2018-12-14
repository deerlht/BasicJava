package com.zhong;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        for(int i=0;i<=100;i++){
            System.out.print(String.format("complete %d%%\r",i));
        }
    }
}
