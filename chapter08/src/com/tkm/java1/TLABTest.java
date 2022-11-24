package com.tkm.java1;

/*
    测试-XX:UseTLAB参数是否开启（默认是开启的）
    jps查看进程
    jinfo -flag UseTLAB 进程号
 */
public class TLABTest {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
