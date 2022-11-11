package com.tkm.java;

public class HelloApp {
    //  在链接的准备阶段，a会被赋值为0
    //  在初始化（clinit）阶段，a才会被赋值为1
    private static int a = 1;

    public static void main(String[] args) {
        System.out.println(a);
    }
}
