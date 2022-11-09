package com.tkm.java;

public class HelloLoader {
    public static void main(String[] args) {
        //  AppClassLoader（系统加载器），加载用户自定义类
        //  类的加载是按需加载的（只有需要时，才会加载）
        System.out.println("由" + HelloLoader.class.getClassLoader() + "加载");
        System.out.println("执行完成");
    }
}
