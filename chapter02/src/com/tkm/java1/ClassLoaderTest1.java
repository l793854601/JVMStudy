package com.tkm.java1;

import com.sun.glass.events.DndEvent;

import java.net.URL;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("*********************************启动类加载器*********************************");
        //  获取Bootstrap ClassLoader能够加载的api的路径
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }

        System.out.println("*********************************扩展类加载器*********************************");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }

        //  DndEvent在\jre\lib\ext\jfxrt下，因此由扩展类加载器（ExtClassLoader）加载
        ClassLoader classLoader = DndEvent.class.getClassLoader();
        System.out.println(classLoader);
    }
}
