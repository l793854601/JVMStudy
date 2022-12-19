package com.tkm.java2;

/*
    测试对象实例化的过程：
    1.加载类元信息
    2.为对象分配内存（指针碰撞法、空闲列表法）
    3.处理并发问题（CAS、加锁、TLAB）
    4.属性初始化（零值初始化）
    5.设置对象头
    6.属性的显示初始化/代码块初始化、构造器初始化
 */
public class Customer {
    int id = 1001;
    String name;
    Account account;



    /*
         0 aload_0
         1 invokespecial #1 <java/lang/Object.<init> : ()V>
         4 aload_0
         5 sipush 1001
         8 putfield #2 <com/tkm/java/Customer.id : I>
        11 getstatic #3 <java/lang/System.out : Ljava/io/PrintStream;>
        14 ldc #4 <block called>
        16 invokevirtual #5 <java/io/PrintStream.println : (Ljava/lang/String;)V>
        19 aload_0
        20 ldc #6 <No Name>
        22 putfield #7 <com/tkm/java/Customer.name : Ljava/lang/String;>
        25 aload_0
        26 ldc #8 <男>
        28 putfield #9 <com/tkm/java/Customer.gender : Ljava/lang/String;>
        31 getstatic #3 <java/lang/System.out : Ljava/io/PrintStream;>
        34 ldc #10 <constructor called>
        36 invokevirtual #5 <java/io/PrintStream.println : (Ljava/lang/String;)V>
        39 aload_0
        40 new #11 <com/tkm/java/Account>
        43 dup
        44 invokespecial #12 <com/tkm/java/Account.<init> : ()V>
        47 putfield #13 <com/tkm/java/Customer.account : Lcom/tkm/java/Account;>
        50 return
     */
    public Customer() {
        System.out.println("constructor called");
        account = new Account();
    }

    {
        //  先于构造器执行，晚于super.init()执行
        //  代码块初始化与属性的显示初始化是并列关系，先后顺序看代码编写的顺序
        System.out.println("block called");
        name = "No Name";
    }

    String gender = "男";

    public static void main(String[] args) {
        Customer customer = new Customer();
    }
}

class Account {

}
