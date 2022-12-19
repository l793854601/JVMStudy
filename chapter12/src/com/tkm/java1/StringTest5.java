package com.tkm.java1;

import org.testng.annotations.Test;

public class StringTest5 {

    @Test
    public void test1() {
        /*
            最终编译为class文件：
            String s1 = "abc";
            String s2 = "abc";
         */
        String s1 = "a" + "b" + "c";    //  编译器优化为"abc"
        String s2 = "abc";
        //  true
        System.out.println(s1 == s2);
        //  true
        System.out.println(s1.equals(s2));
    }

    @Test
    public void test2() {
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        //  编译期优化
        String s4 = "javaEE" + "hadoop";
        //  有变量参加+拼接操作，则本质为StringBuilder.append()，再toString()
        //  toString()本质约等于new String()
        //  new String()存放在堆中（非常量池）
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        //  true
        System.out.println(s3 == s4);
        //  false
        System.out.println(s3 == s5);
        //  false
        System.out.println(s3 == s6);
        //  false
        System.out.println(s3 == s7);
        //  false
        System.out.println(s5 == s6);
        //  false
        System.out.println(s5 == s7);
        //  false
        System.out.println(s6 == s7);

        //  将s6的内容尝试放入常量池（常量池中已存在javaEEhadoop，则不会放入常量池）
        String s8 = s6.intern();
        //  true
        System.out.println(s3 == s8);
    }

    @Test
    public void test3() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        /*
            String s4 = s1 + s2的执行细节：
            1.StringBuilder sb = new StringBuilder();
            2.a.append(s1);
            3.a.append(s2);
            4.String s4 = sb.toString();

            补充：
            在JDK5之后，使用的是StringBuilder拼接
            在JDK5之前，使用的是StringBuffer拼接
         */
        String s4 = s1 + s2;
        //  false
        System.out.println(s3 == s4);
    }

    /*
        字符串拼接的操作不一定是StringBuilder
        如果+两边都是常量/常量引用，则仍然使用编译期优化，而非StringBuilder.append()
        针对于final修饰的类、方法、基本数据类型、引用数据类型时，能使用就使用
     */
    @Test
    public void test4() {
        final String s1 = "a";
        final String s2 = "b";
        String s3 = "ab";
        //  相当于String = "ab";
        String s4 = s1 + s2;
        //  true
        System.out.println(s3 == s4);
    }

    @Test
    public void test5() {
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        //  false
        System.out.println(s1 == s3);

        final String s4 = "javaEE";
        String s5 = s4 + "hadoop";
        //  true
        System.out.println(s1 == s5);
    }

    /*
        通过StringBuilder的append方式，远高于直接String+拼接方式
        1.StringBuilder.append方式，自始至终只创建了一个StringBuilder。
          使用String的字符串拼接方式，创建过多的StringBuilder和String对象
        2.使用String的字符串拼接方式：由于创建较多的StringBuilder、String对象，内存使用过大，如果需要GC，需要花费额外的时间

        改进的空间：
        在实际开发中，如果基本确定要前前后后添加的字符串长度不高于某个限定值highLevel的情况下，建议使用以下构造方式：
        StringBuilder sb = new StringBuilder(highLevel);    //  new byte[highLevel]
     */
    @Test
    public void test6() {
        long start = System.currentTimeMillis();
        //  6272ms
//        method1(100000);
        //  5ms
        method2(100000);
        long end = System.currentTimeMillis();
        System.out.println("cost: " + (end - start) + "ms");
    }

    private void method1(long times) {
        String s1 = "";
        for (long i = 0; i < times; i++) {
            //  每次拼接，都要先new StringBuilder、append、toString()
            //  append内部也会创建String
            s1 += i;
        }
    }

    private void method2(long times) {
        StringBuilder sb = new StringBuilder();
        for (long i = 0; i < times; i++) {
            sb.append(i);
        }
        sb.toString();
    }
}
