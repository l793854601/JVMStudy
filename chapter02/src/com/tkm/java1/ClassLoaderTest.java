package com.tkm.java1;

public class ClassLoaderTest {
    public static void main(String[] args) {
        //  获取系统类加载
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //  获取扩展类加载器（JDK9之后改为PlatformClassLoader）
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);
        //  试图获取引导类加载器（扩展类加载器的上层）
        //  引导类加载器是由C/C++实现的
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        System.out.println(bootStrapClassLoader);
        //  用户自定义类的类加载器
        //  用户自定义类是由系统类加载器加载的
        System.out.println(ClassLoaderTest.class.getClassLoader());
        //  获取系统核心类的类加载器
        //  Java的核心类是由引导类加载器加载的
        System.out.println(String.class.getClassLoader());
        System.out.println(Object.class.getClassLoader());
    }
}
