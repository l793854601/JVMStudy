package com.tkm.java;

public class HeapSpaceInitial {
    public static void main(String[] args) {
        //  返回JVM中的堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        //  返回JVM试图使用的最大堆内存量
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("-Xms: " + initialMemory + "M");
        System.out.println("-Xmx: " + maxMemory + "M");
        System.out.println("系统内存：" + initialMemory * 64.0 / 1024 + "G");
        System.out.println("系统内存：" + maxMemory * 4.0 / 1024 + "G");
    }
}
