package com.tkm.java;

public class PCRegisterTest {
    /*
        指令地址（偏移地址）：操作指令
         0: bipush        10
         2: istore_1
         3: bipush        20
         5: istore_2
         6: iload_1
         7: iload_2
         8: iadd
         9: istore_3
        10: ldc           #2                  // String abc
        12: astore        4
        14: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        17: iload_1
        18: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        21: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        24: iload_3
        25: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
        28: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        31: aload         4
        33: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        36: return
     */
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = i + j;

        String s = "abc";
        System.out.println(i);
        System.out.println(k);
        System.out.println(s);
    }
}
