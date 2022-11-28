package com.tkm.java;

public class MethodAreaTest {
    /*
         0: aconst_null
         1: astore_1
         2: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         5: aload_1
         6: pop
         7: getstatic     #3                  // Field com/tkm/java/Order.count:I
        10: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        13: aload_1
        14: pop
        15: invokestatic  #5                  // Method com/tkm/java/Order.hello:()V
        18: return
     */
    public static void main(String[] args) {
        Order order = null;
        //  并不会抛空指针异常
        //  因为count、hello()为静态结构，没有类的实例也能访问
        System.out.println(order.count);
        order.hello();
    }
}

class Order {
    /*
        public static int count;
            descriptor: I
            flags: (0x0009) ACC_PUBLIC, ACC_STATIC
     */
    public static int count = 1;

    /*
        public static final int number;
            descriptor: I
            flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
            ConstantValue: int 2

        说明声明为final的属性，在编译期就确定其值了
     */
    public static final int number = 2;

    /*
        public final int fieldValue;
            descriptor: I
            flags: (0x0011) ACC_PUBLIC, ACC_FINAL
            ConstantValue: int 10
     */
    public final int fieldValue = 10;

    public static void hello() {
        System.out.println("Hello!");
    }
}