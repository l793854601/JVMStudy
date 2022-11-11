package com.tkm.java;

public class ClassInitTest {
    /*
        clinit：
         0 iconst_1
         1 putstatic #13 <com/tkm/java/ClassInitTest.num : I>
         4 iconst_2
         5 putstatic #13 <com/tkm/java/ClassInitTest.num : I>
         8 bipush 20
        10 putstatic #25 <com/tkm/java/ClassInitTest.number : I>
        13 bipush 10
        15 putstatic #25 <com/tkm/java/ClassInitTest.number : I>
        18 return

        1.num是在初始化阶段的clinit方法中被赋值的，clinit阶段会将类变量的显示赋值与静态代码块合并
        2.number在clinit过程中，先赋值为20，再被赋值为10
     */
    private static int num = 1;

    static {
        num = 2;
        number = 20;
        System.out.println(num);
        //  报错：非法的向前引用
//        System.out.println(number);
    }

    private static int number = 10;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }
}
