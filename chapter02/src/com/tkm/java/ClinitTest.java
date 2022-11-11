package com.tkm.java;

/*
    该例子中，没有静态变量跟静态代码块，因此就没有生成clinit
 */
public class ClinitTest {
    //  任何一个类声明以后，内部至少存在一个类的构造器（可能是显示声明的，也可能是系统生成的无参构造器）
    private int a = 1;

    public ClinitTest() {
        a = 10;
        int d = 20;
    }

    //  如果存在静态代码块，即使里面什么都不做，也会生成clinit
//    static {
//
//    }

    public static void main(String[] args) {
        int b = 2;
    }
}
