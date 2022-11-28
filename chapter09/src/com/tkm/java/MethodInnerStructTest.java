package com.tkm.java;

import java.io.Serializable;

/*
    测试方法区的内部结构
 */
public class MethodInnerStructTest implements Comparable<String>, Serializable {
    //  实例变量
    public int num = 10;
    //  静态变量
    private static String str = "Just Test";

    //  不显式创建构造器，编译器会生成一个无参构造器
//    public MethodInnerStructTest() {}

    //  实例方法
    public void test1() {
        int count = 20;
        System.out.println("count = " + count);
    }

    //  静态方法
    public static int test(int cal) {
        int result = 0;
        try {
            int value = 30;
            result = value / cal;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
