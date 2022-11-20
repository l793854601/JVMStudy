package com.tkm.java2;

class Father {
    public Father() {
        System.out.println("Father的无参构造器");
    }

    public static void showStatic(String str) {
        System.out.println("Father: " + str);
    }

    public final void showFinal() {
        System.out.println("father showFinal");
    }

    public void showCommon() {
        System.out.println("father showCommon");
    }
}

public class Son extends Father {
    public Son() {
        //  显示调用父类构造器
        //  invokespecial #1 <com/tkm/java2/Father.<init> : ()V>
        super();
    }

    public Son(int age) {
        //  调用自身的构造器
        //  invokespecial #2 <com/tkm/java2/Son.<init> : ()V>
        this();
    }

    //  不是重写的父类静态方法（静态方法不能被重写）
    public static void showStatic(String str) {
        System.out.println("Son: " + str);
    }

    private void showPrivate(String str) {
        System.out.println("son showPrivate: " + str);
    }

    public void show() {
        //  调用静态方法
        //  invokestatic #12 <com/tkm/java2/Son.showStatic : (Ljava/lang/String;)V>
        showStatic("tkm");
        //  调用父类的静态方法
        //  invokestatic #14 <com/tkm/java2/Father.showStatic : (Ljava/lang/String;)V>
        super.showStatic("good");
        //  调用私有方法
        //  invokespecial #15 <com/tkm/java2/Son.showPrivate : (Ljava/lang/String;)V>
        showPrivate("good");
        //  显示调用父类方法
        //  invokespecial #16 <com/tkm/java2/Father.showCommon : ()V>
        super.showCommon();
        //  调用final修饰的方法，final方法不能被重写，因此也认为是非虚方法（早期绑定）
        //  invokevirtual #17 <com/tkm/java2/Son.showFinal : ()V>
        showFinal();
        //  调用普通方法
        //  invokevirtual #18 <com/tkm/java2/Son.showCommon : ()V>
        showCommon();
        //  调用普通方法
        //  invokevirtual #19 <com/tkm/java2/Son.info : ()V>
        info();

        //  调用接口方法
        //  invokeinterface #20 <com/tkm/java2/MethodInterface.methodA : ()V> count 1
        MethodInterface mi = null;
        mi.methodA();
    }

    public void info() {

    }
}

interface MethodInterface {
    void methodA();
}
