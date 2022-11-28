package com.tkm.java1;

public class MethodAreaDemo {
    /*
        0 sipush 500
        3 istore_1
        4 bipush 100
        6 istore_2
        7 iload_1
        8 iload_2
        9 idiv
       10 istore_3
       11 bipush 50
       13 istore 4
       15 getstatic #2 <java/lang/System.out : Ljava/io/PrintStream;>
       18 iload_3
       19 iload 4
       21 iadd
       22 invokevirtual #3 <java/io/PrintStream.println : (I)V>
       25 return
     */
    public static void main(String[] args) {
        int x = 500;
        int y = 100;
        int a = x / y;
        int b = 50;
        System.out.println(a + b);
    }
}
