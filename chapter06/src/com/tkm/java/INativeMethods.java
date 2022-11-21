package com.tkm.java;

import java.io.IOException;

/*
    区别于抽象方法，本地方法是有方法实现的，只不过不在当前文件
 */
public class INativeMethods {
    public native void native1(int x);

    public static native long native2();

    private synchronized native float native3(Object object);

    native void native4() throws IOException;

    public static void main(String[] args) {
        INativeMethods methods = new INativeMethods();
        //  java.lang.UnsatisfiedLinkError
        methods.native1(10);
    }
}
