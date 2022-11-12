package com.tkm.java1;

public class StringTest {
    public static void main(String[] args) {
        java.lang.String s = new java.lang.String();
        //  当前String使用的还是核心类中的String，由Bootstrap ClassLoader加载
        System.out.println(s.getClass().getClassLoader());
        System.out.println("hello world");
    }
}
