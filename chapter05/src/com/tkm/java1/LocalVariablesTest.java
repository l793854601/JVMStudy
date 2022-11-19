package com.tkm.java1;

import java.util.Date;

public class LocalVariablesTest {
    private int count = 0;

    /*
        //  stack：操作数栈最大深度
        //  locals：局部变量表的长度（编译期间确定，且在运行期不会也不能改变）
        stack=2, locals=3, args_size=1

        //  Java源代码行号与JVM指令行号的映射
        LineNumberTable:
          line 20: 0
          line 21: 8
          line 22: 11
          line 23: 15

        //  局部变量表
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  args   [Ljava/lang/String;
            8       8     1  test   Lcom/tkm/java1/LocalVariablesTest;
           11       5     2   num   I
     */
    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    //  联系
    public static void testStatic() {
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int count = 10;
        System.out.println(count);
    }

    public static int testStaticReturn() {
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int count = 10;
        System.out.println(count);
        return count;
    }

    public void test1() {
        Date date = new Date();
        String name = "tkm";
        String info = test2(date, name);
        System.out.println(date + name);
    }

    public String test2(Date date, String name) {
        return date.toString() + name;
    }

    public void test3() {
        this.count++;
    }

    //  Slot复用
    public void test4() {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        //  b在超过了其作用域后，其槽位很可能会被其他局部变量复用
        int c = a + 1;
    }
}
