package com.tkm.java1;

import java.util.Date;

public class LocalVariablesTest {
    private int count = 0;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    public void test1() {
        Date date = new Date();
        String name = "tkm";
        String info = test2(date, name);
        System.out.println(date + name);
    }

    private String test2(Date date, String name) {
        return date.toString() + name;
    }
}
