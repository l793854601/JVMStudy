package com.tkm.java1;

/*
    《深入理解Java虚拟机》中的案例：
    staticObj、instanceObj、localObj存放在哪里？

    instanceObj随着Test的对象实例存放在Java堆。
    localObj则是存放在foo()方法栈帧的局部变量表中。
    staticObj是放在堆空间。

    只要是对象实例（对象本身），必然会在Java堆中分配。

    JDK7及以后版本，HotSpot VM选择把静态变量与类型在Java语言一端的映射Class对象存放在一起，存储于Java堆中。
 */
public class StaticObjectTest {
    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }
    }

    private static class ObjectHolder {

    }
}
