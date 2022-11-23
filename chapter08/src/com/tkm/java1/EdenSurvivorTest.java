package com.tkm.java1;

/*
    -XX:NewRatio：设置新生代与老年代的比例，默认为2
    -XX:SurvivorRatio：设置新生代中Eden区与Survivor区的比例，默认为8
    -XX:UseAdaptiveSizePolicy：关闭自适应的内存分配策略
    -Xmn：设置新生代的空间大小

    jinfo -flag NewRatio 进程号，查看该进程新生代、老年代所占比例
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
