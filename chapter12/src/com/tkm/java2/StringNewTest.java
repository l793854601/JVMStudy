package com.tkm.java2;

/*
    new String("ab");会创建几个对象？
    1.new关键字在堆中创建的
    2.字符串常量池中的对象"ab"（字节码指令：ldc）

    new String("a") + new String("b");会创建几个对象？
    1.new StringBuilder()
    2.new String("a")
    3.常量池中的"a"
    4.new String("b")
    5.常量池中的"b"

    深入剖析：StringBuilder.toString()
    6.new String("ab")

    此时，在执行完new String("ab")之后，字符串常量池中没有"ab"
 */
public class StringNewTest {
    public static void main(String[] args) {
        /*
            0 new #2 <java/lang/String>
            3 dup
            4 ldc #3 <ab>
            6 invokespecial #4 <java/lang/String.<init> : (Ljava/lang/String;)V>
            9 astore_1
         */
        String s = new String("ab");

        /*
            10 new #5 <java/lang/StringBuilder>
            13 dup
            14 invokespecial #6 <java/lang/StringBuilder.<init> : ()V>
            17 new #2 <java/lang/String>
            20 dup
            21 ldc #7 <a>
            23 invokespecial #4 <java/lang/String.<init> : (Ljava/lang/String;)V>
            26 invokevirtual #8 <java/lang/StringBuilder.append : (Ljava/lang/String;)Ljava/lang/StringBuilder;>
            29 new #2 <java/lang/String>
            32 dup
            33 ldc #9 <b>
            35 invokespecial #4 <java/lang/String.<init> : (Ljava/lang/String;)V>
            38 invokevirtual #8 <java/lang/StringBuilder.append : (Ljava/lang/String;)Ljava/lang/StringBuilder;>
            41 invokevirtual #10 <java/lang/StringBuilder.toString : ()Ljava/lang/String;>
            44 astore_2
         */
        String s1 = new String("a") + new String("b");
    }
}
