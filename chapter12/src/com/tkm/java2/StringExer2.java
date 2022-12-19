package com.tkm.java2;

import org.testng.annotations.Test;

public class StringExer2 {

    @Test
    public void test1() {
        String s1 = new String("a") + new String("b");
        s1.intern();
        String s2 = "ab";
        //  true
        System.out.println(s1 == s2);
    }

    @Test
    public void test2() {
        String s1 = new String("ab");
        s1.intern();
        String s2 = "ab";
        //  false
        System.out.println(s1 == s2);
    }
}
