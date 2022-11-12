package java.lang;

/*
    双亲委派机制是如何加载String类的：
    1.用户自定义的类应该由系统类加载器加载，但首先会逐级向上请求，直到启动类加载器
    2.启动类加载器发现此String为java.lang包下的，可以由自己加载，则完成此次加载
    3.由于系统类中的String没有main方法，因此执行main方法会报错
 */
public class String {
    static {
        System.out.println("Custom String Class static block called");
    }


    /*
        错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
            public static void main(String[] args)
        否则 JavaFX 应用程序类必须扩展javafx.application.Application
     */
    public static void main(String[] args) {

    }
}
