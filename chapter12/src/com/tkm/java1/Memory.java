package com.tkm.java1;

public class Memory {
    public static void main(String[] args) {
        int i = 1;
        Object obj = new Object();
        Memory memory = new Memory();
        memory.foo(obj);
    }

    private void foo(Object obj) {
        String string = obj.toString();
        System.out.println(string);
    }
}
