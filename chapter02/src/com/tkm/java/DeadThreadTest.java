package com.tkm.java;

public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            System.out.println(new DeadThread());
            System.out.println(Thread.currentThread().getName() + "结束");
        };
        Thread t1 = new Thread(r, "线程1");
        Thread t2 = new Thread(r, "线程2");
        t1.start();
        t2.start();
    }
}

class DeadThread {
    //  static是在类初始化阶段执行，类初始化阶段必须保证是线程同步的
    static {
        //  外层加一个true，防止编译报错
        if (true) {
            System.out.println(Thread.currentThread().getName() + "正在初始化当前类");
            while (true) {

            }
        }
    }
}
