package com.tkm.java1;

import java.io.FileNotFoundException;

public class CustomClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath(name);
            if (result == null) {
                throw new FileNotFoundException();
            } else {
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private byte[] getClassFromCustomPath(String name) {
        //  从自定义路径中加载指定类，细节略
        //  如果指定路径的字节码文件进行了加密，则需要在此方法中解密
        return null;
    }

    public static void main(String[] args) {
        CustomClassLoader classLoader = new CustomClassLoader();
        try {
            Class<?> clazz = Class.forName("One", true, classLoader);
            Object obj = clazz.newInstance();
            System.out.println(obj.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
