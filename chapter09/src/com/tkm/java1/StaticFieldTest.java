package com.tkm.java1;

/*
    静态引用对应的对象实体始终刚都存在堆空间

    JDK7:
    -Xms200m -Xmx300m -XX:PermSize=300m -XX:MaxPermSize=300m -XX:+PrintGCDetails

    JDK8:
    -Xms200m -Xmx300m -XX:MetaspaceSize=300m -XX:MaxMetaspaceSize=300m -XX:+PrintGCDetails

    arr被放在了堆区的老年代（102400K）

    Heap
        PSYoungGen      total 59904K, used 5171K [0x00000007e7300000, 0x00000007eb580000, 0x00000007ed800000)
            eden space 51712K, 10% used [0x00000007e7300000,0x00000007e780cf70,0x00000007ea580000)
            from space 8192K, 0% used [0x00000007ead80000,0x00000007ead80000,0x00000007eb580000)
        to   space 8192K, 0% used [0x00000007ea580000,0x00000007ea580000,0x00000007ead80000)
    ParOldGen       total 136704K, used 102400K [0x00000007da800000, 0x00000007e2d80000, 0x00000007e7300000)
        object space 136704K, 74% used [0x00000007da800000,0x00000007e0c00010,0x00000007e2d80000)
    Metaspace       used 3382K, capacity 4496K, committed 4864K, reserved 1056768K
        class space    used 367K, capacity 388K, committed 512K, reserved 1048576K
 */
public class StaticFieldTest {
    //  100M
    private static byte[] arr = new byte[1024 * 1024 * 100];

    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);

    }
}
