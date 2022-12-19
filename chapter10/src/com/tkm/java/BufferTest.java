package com.tkm.java;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * IO               NIO（New IO/None-Blocking IO）
 * byte[]/char[]    Buffer
 * Stream           Channel
 *
 * 查看直接内存的占用与释放
 */
public class BufferTest {
    private static final int BUFFER = 1024 * 1024 * 1024;

    public static void main(String[] args) {
        //  创建直接内存
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("直接内存分配完毕");

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("直接内存开始释放");
        byteBuffer = null;
        System.gc();
        scanner.next();
    }
}
