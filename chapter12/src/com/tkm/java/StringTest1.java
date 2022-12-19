package com.tkm.java;

import org.testng.annotations.Test;

public class StringTest1 {

    @Test
    public void test1() {
        //  字面量定义的方式，"abc"存储在字符串常量池中
        String s1 = "abc";
        //  "abc"中已存在于字符串常量池中，因此不会重复创建
        String s2 = "abc";
        System.out.println(s1 == s2);
        //  在字符串常量池中创建"hello"（不会将"abc"从字符串常量池中删除）
        s1 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test2() {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        //  根据字节码分析，可看出+操作实际上是执行了StringBuilder的append操作，再执行toString，赋值给s2
        s2 += "edf";
        System.out.println(s1 == s2);
        System.out.println(s2);
        System.out.println(s1);
    }

    @Test
    public void test3() {
        String s1 = "abc";
        //  replace内部会创建新的String，不会修改原有的String（不可变性）
        String s2 = s1.replace('a', 'A');
        System.out.println(s1);
        System.out.println(s2);
    }
}
