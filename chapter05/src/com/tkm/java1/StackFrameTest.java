package com.tkm.java1;

/*
    方法的结束方式有两种：
    1.正常结束（return）
    2.出现未捕获的异常，以异常的方式结束
 */
public class StackFrameTest {
    public static void main(String[] args) {
        //  如果处理了异常，则使用goto跳转到正常的流程
        try {
            StackFrameTest test = new StackFrameTest();
            test.method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }

    public void method1() {
        System.out.println("method1 called");
        method2();
        System.out.println("method1 will end");
        System.out.println(10 / 0);
    }

    public int method2() {
        System.out.println("method2 called");
        int i = 10;
        int m =  (int) method3();
        System.out.println("method2 will end");
        return i + m;
    }

    public double method3() {
        System.out.println("method3 called");
        double j = 20;
        System.out.println("method3 will end");
        return j;
    }
}
