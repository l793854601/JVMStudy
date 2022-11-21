package com.tkm.java3;

/*
    StringBuffer vs StringBuilder
    StringBuffer为线程安全的
    StringBuilder为线程不安全的

    线程安全：
    如果同一时刻，只有一个线程操作此数据，则此数据为线程安全的
    如果同一时刻，有多个线程操作该数据，则此数据为共享数据。如果不考虑线程同步，则此数据存在线程安全问题
 */
public class StringBuilderTest {
    //  StringBuilder作用域在方法内，为线程安全的
    public static void method1() {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
    }

    //  StringBuilder作为方法入参，有可能会被其他方法（线程）访问，为线程不安全的
    public static void method2(StringBuilder sb) {
        sb.append(1);
        sb.append(2);
    }

    //  StringBuilder作为方法返回值，有可能会被其他方法（线程）访问，为线程不安全的
    public static StringBuilder method3() {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        return sb;
    }
}
