package com.tkm.java2;

public class SynchronizedTest {

    public void f() {
        Object hollis = new EscapeAnalysis();
        //  hollis仅在f方法内使用，不会有其他线程所访问，因此没有必要在此加锁
        //  在编译成字节码阶段不会被优化掉
        //  在JIT编一阶段会被优化掉
        synchronized (hollis) {
            System.out.println(hollis);
        }
    }
}
