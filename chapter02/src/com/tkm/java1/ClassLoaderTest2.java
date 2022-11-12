package com.tkm.java1;

import org.testng.annotations.Test;

public class ClassLoaderTest2 {
    public static void main(String[] args) {

    }

    //  1.通过Class.getClassLoader()获取类加载器
    @Test
    public void test1() throws ClassNotFoundException {
        ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader);
    }

    //  2.通过Thread.currentThread().getContextClassLoader()获取当前类的类加载器
    @Test
    public void test2() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
    }

    //  3.通过ClassLoader.getSystemClassLoader()获取系统类加载器，再通过系统类加载器获取扩展类加载器
    @Test
    public void test3() {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(systemClassLoader);
        System.out.println(extClassLoader);
    }
}
