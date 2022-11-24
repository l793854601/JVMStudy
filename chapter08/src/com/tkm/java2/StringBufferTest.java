package com.tkm.java2;

public class StringBufferTest {
    public static StringBuffer createStringBuffer(String s1, String s2) {
        //  sb发生了逃逸，如果不想让sb逃逸，则可以用下面的方法
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        return sb;
    }

    public static String createString(String s1, String s2) {
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        return sb.toString();
    }
}
