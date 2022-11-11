package com.tkm.java;

public class ClinitTest1 {
    static class Father {
        public static int A = 1;
        static {
            System.out.println("Father static code block called");
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;

        static {
            System.out.println("Son static code block called");
        }
    }

    public static void main(String[] args) {
        //  如果未使用Son类，则不会初始化Son类，也不会初始化Son的父类Father类
        //  如果使用了Son类，则JVM会保证Son的父类Father类先被加载，再加载Son类
        System.out.println(Son.B);
    }
}
