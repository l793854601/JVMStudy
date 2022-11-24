package com.tkm.java2;

/*
    栈上分配测试
    -Xmx1G -Xms1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails

    关闭逃逸分析：花费时间为：64ms
    开启逃逸分析：花费时间为：7ms

    原因：开启逃逸分析后，未逃逸的对象随着方法执行结束，栈帧的销毁而销毁了，没有经历GC。
 */
public class StackAllocTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间为：" + (end - start) + "ms");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void alloc() {
        //  user未发生逃逸，因此可以将user分配到栈上
        User user = new User();
    }

    static class User {

    }
}
