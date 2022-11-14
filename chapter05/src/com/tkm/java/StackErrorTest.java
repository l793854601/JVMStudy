package com.tkm.java;

/*
    演示栈中的异常
    设置栈大小：-Xss800k
 */
public class StackErrorTest {

    private static int count = 0;

    public static void main(String[] args) {
        //  死递归
        //  java.lang.StackOverflowError
        try {
            count++;
            main(args);
        } catch (Throwable t) {
            System.out.println(t);
            System.out.println(count);
        }
    }
}
