package com.tkm.java2;

/*
    如何保证变量s指向的是字符串常量池中的数据：
    1.字面量定义：
        String s = "hello";
    2.调用intern()：
        String s = new String("hello").intern();
        String s = new StringBuilder("hello").toString().intern();
 */
public class StringIntern {
    public static void main(String[] args) {
        String s = new String("1");
        //  调用此方法之前，字符串常量池中已经存在"1"
        s.intern();
        String s2 = "1";
        //  jdk6: false jdk7/8: false
        System.out.println(s == s2);

        //  s3的地址记录的是new String("11");
        //  但"11"并不存在于字符串常量池
        String s3 = new String("1") + new String("1");
        //  调用此方法之前，字符串常量池中不存在"11"
        //  jdk6：创建了一个新的对象"11"，也就有新的地址
        //  jdk7：此时字符串常量池中并没有创建"11"，而是创建了一个指向堆空间中new String("11")的地址
        s3.intern();
        //  s4变量记录的地址：使用的是上一回代码执行时，在常量池中生成的"11"的地址（jdk7记录的是堆中new String("11")的地址）
        String s4 = "11";
        //  jdk6: false jdk7/8: true
        System.out.println(s3 == s4);
    }
}
