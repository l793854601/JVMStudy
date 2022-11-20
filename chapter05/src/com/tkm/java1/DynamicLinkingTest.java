package com.tkm.java1;

public class DynamicLinkingTest {

    int num = 10;

    public void methodA() {
        System.out.println("methodA called");
    }

    public void methodB() {
        System.out.println("methodB called");
        methodA();
        num++;
    }
}
