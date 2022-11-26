package com.tkm.java;

/*
    测试设置方法区大小参数的默认值
    -Xms600m -Xmx600m
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("Start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
