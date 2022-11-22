package com.tkm.java;

/*
    -XX:+PrintGCDetails：打印GC日志

    JDK1.8情况下：
    Heap
        //  年轻代
        PSYoungGen      total 76288K, used 3932K [0x000000076ab00000, 0x0000000770000000, 0x00000007c0000000)
            //  Eden区
            eden space 65536K, 6% used [0x000000076ab00000,0x000000076aed7240,0x000000076eb00000)
            //  S0区
            from space 10752K, 0% used [0x000000076f580000,0x000000076f580000,0x0000000770000000)
            //  S1区
            to   space 10752K, 0% used [0x000000076eb00000,0x000000076eb00000,0x000000076f580000)
        //  老年代
        ParOldGen       total 175104K, used 0K [0x00000006c0000000, 0x00000006cab00000, 0x000000076ab00000)
            object space 175104K, 0% used [0x00000006c0000000,0x00000006c0000000,0x00000006cab00000)
        //  元空间（JDK1.7及之前为PsPermGen，也就是永久代）
        Metaspace       used 3199K, capacity 4496K, committed 4864K, reserved 1056768K
            class space    used 342K, capacity 388K, committed 512K, reserved 1048576K
 */
public class SimpleHeap {
    private int id;

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("My Id is " + id);
    }

    /*
        //  一旦执行new指令，则会在堆空间中开辟空间，并创建对象
        0 new #11 <com/tkm/java/SimpleHeap>
        3 dup
        4 bipush 10
        6 invokespecial #12 <com/tkm/java/SimpleHeap.<init> : (I)V>
        9 astore_1
       10 new #11 <com/tkm/java/SimpleHeap>
       13 dup
       14 bipush 20
       16 invokespecial #12 <com/tkm/java/SimpleHeap.<init> : (I)V>
       19 astore_2
       20 bipush 10
       22 newarray 10 (int)
       24 astore_3
       25 bipush 20
       27 anewarray #13 <java/lang/Object>
       30 astore 4
       32 return
     */
    public static void main(String[] args) {
        SimpleHeap s1 = new SimpleHeap(10);
        SimpleHeap s2 = new SimpleHeap(20);

        int[] arr1 = new int[10];
        Object[] arr2 = new Object[20];
    }
}
