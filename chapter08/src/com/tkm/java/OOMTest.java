package com.tkm.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
    java.lang.OutOfMemoryError: Java heap space
    GC时，新生代无法回收的对象会被放入老年代。老年代中已经没有多余的空间存放对象时，则会抛出OOM
 */
public class OOMTest {
    public static void main(String[] args) {
        List<Picture> list = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Picture picture = new Picture(new Random().nextInt(1024 * 1024));
            list.add(picture);
        }
    }
}

class Picture {
    private byte[] pixels;

    public Picture(int length) {
        pixels = new byte[length];
    }
}
