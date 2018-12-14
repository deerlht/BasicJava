package com.zhong;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args ) throws InterruptedException {
        float a = 0.01;
        float b = 0.88;
        float c = a + b;
            System.out.print(String.format("%.10f",c));
        System.out.println(c<0.89);

    }
}
