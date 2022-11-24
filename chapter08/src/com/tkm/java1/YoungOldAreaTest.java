package com.tkm.java1;

/*
    -Xms60m：堆初始内存为60m
    -Xmx60m：堆尝试申请最大内存为60m
    -XX:NewRatio=2：老年代/新生代=2
    -XX:SurvivorRatio=8：Eden/Survivor=8
    -XX:+PrintGCDetails

    Heap
        PSYoungGen      total 19456K, used 2095K [0x00000007beb00000, 0x00000007c0000000, 0x00000007c0000000)
            eden space 17408K, 12% used [0x00000007beb00000,0x00000007bed0bc90,0x00000007bfc00000)
            from space 2048K, 0% used [0x00000007bfe00000,0x00000007bfe00000,0x00000007c0000000)
            to   space 2048K, 0% used [0x00000007bfc00000,0x00000007bfc00000,0x00000007bfe00000)
        //  used 20480K，即20m，就是在Eden没有放下的byte数组
        ParOldGen       total 44032K, used 20480K [0x00000007bc000000, 0x00000007beb00000, 0x00000007beb00000)
            object space 44032K, 46% used [0x00000007bc000000,0x00000007bd400010,0x00000007beb00000)
        Metaspace       used 3279K, capacity 4496K, committed 4864K, reserved 1056768K
            class space    used 349K, capacity 388K, committed 512K, reserved 1048576K
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        //  根据参数，Eden区的空间为16m
        //  申请的对象大小为20m，超过了Eden区最大容量，则将直接晋升至老年代
        byte[] buffer = new byte[1024 * 1024 * 20];
    }
}
