package com.tkm.java;

/*
    -Xms用来设置堆空间（年轻代+老年代）的初始内存大小
        -X：JVM的运行参数
        ms：memory start
    -Xmx用来设置堆空间（年轻代+老年代）的最大内存大小

    Eden区可以存放对象，S0或S1能存放对象，也就是说，S0跟S1不能同时存放对象，同一时刻，要么S0中有数据，要么S1中有数据

    jps：查看当前进程
    jstat -gc 进程id 查看设置堆的参数
 */
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
