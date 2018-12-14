package com.zhong;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main(String[] args) throws InterruptedException {
        float a = 0.01f;
        float b = 0.88f;
        float c = a + b;
        System.out.println(String.format("%.2f", c));
        System.out.println(String.format("%.3f", c));
        System.out.println(String.format("%.4f", c));
        System.out.println(String.format("%.5f", c));
        System.out.println(String.format("%.6f", c));
        System.out.println(String.format("%.7f", c));
        System.out.println(String.format("%.8f", c));
        System.out.println(String.format("%.9f", c));
        System.out.println(String.format("%.10f", c));

        System.out.println(c < 0.89);
    }
}
