package com.tkm.java;

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
