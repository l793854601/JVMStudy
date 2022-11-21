package com.tkm.java3;

import java.io.IOException;
import java.util.Date;

/*
    返回指令包含ireturn（当返回值是boolean、byte、char、short、int类型时使用）
    lretur、freturn、dreturn、areturn分别对应long、float、double、引用类型
    return为void或实例初始化方法、类和接口方法的初始化方法
 */
public class ReturnAddressTest {

    public ReturnAddressTest() {
        //  return
    }

    public void  returnVoid() {
        //  return
    }

    public boolean returnBoolean() {
        //  ireturn
        return false;
    }

    public byte returnByte() {
        //  ireturn
        return 1;
    }

    public short returnShort() {
        //  ireturn
        return 2;
    }

    public char returnChar() {
        //  ireturn
        return 'c';
    }

    public int returnInt() {
        //  ireturn
        return 20;
    }

    public long returnLong() {
        //  lreturn
        return 100L;
    }

    public float returnFloat() {
        //  freturn
        return 1.0f;
    }

    public double returnDouble() {
        //  dreturn
        return 1.1;
    }

    public String returnString() {
        //  areturn
        return "tkm";
    }

    public Date returnDate() {
        //  areturn
        return new Date();
    }

    static {
        int i = 10;
        //  return
    }

    /*
         0: aload_0
         1: invokevirtual #9                  // Method method1:()V
         4: goto          12
         7: astore_1
         8: aload_1
         9: invokevirtual #11                 // Method java/lang/Exception.printStackTrace:()V
        12: return

        //  异常处理表：
        //  0、4、7代表JVM指令的行号
        //  从0行到4行出现的异常，则按照7行（catch内部的逻辑）处理
        Exception table:
        from  to  target type
        0     4   7      Class java/lang/Exception
     */
    public void method() {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void method1() throws IOException {
        //  athrow
        throw new IOException();
    }

    public void method2() {
        throw new RuntimeException();
    }
}
