package com.tkm.java1;

import java.util.ArrayList;
import java.util.List;

public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "com.tkm.java";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable t) {
            //  java.lang.OutOfMemoryError: Java heap space
            t.printStackTrace();
            System.out.println("遍历次数：" + i);
        }
    }
}
