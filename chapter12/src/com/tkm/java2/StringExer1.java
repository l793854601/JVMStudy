package com.tkm.java2;

public class StringExer1 {
    public static void main(String[] args) {
        String s = new String("a") + new String("b");
        String s2 = s.intern();
        //  true
        System.out.println(s2 == "ab");
        //  true
        System.out.println(s == "ab");
    }
}
