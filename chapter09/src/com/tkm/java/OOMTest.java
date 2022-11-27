package com.tkm.java;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/*
    演示方法区（元空间）OOM
    -XX:MetaspaceSize=30m -XX:MaxMetaspaceSize=30m
 */
public class OOMTest extends ClassLoader {
    public static void main(String[] args) {
        int j = 0;
        try {
            OOMTest test = new OOMTest();
            for (int i = 0; i < 100000; i++) {
                //  创建ClassWriter对象，用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                //  指明版本号（1.8）、修饰符（public）、类名、包名、父类、接口
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                //  返回byte[]
                byte[] code = classWriter.toByteArray();
                //  生成Class
                test.defineClass("Class" + i, code, 0, code.length);
                j++;
            }
        } catch (Throwable t) {
            //  java.lang.OutOfMemoryError: Metaspace
            t.printStackTrace();
        } finally {
            System.out.println(j);
        }
    }
}