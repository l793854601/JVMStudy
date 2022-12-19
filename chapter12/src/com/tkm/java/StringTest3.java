package com.tkm.java;

import java.util.HashSet;
import java.util.Set;

/*
    JDK8中：
    -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m -Xms10m -Xmx10m
 */
public class StringTest3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
