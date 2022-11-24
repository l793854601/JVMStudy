package com.tkm.java2;

/*
    逃逸分析：
    如何快速判断是否发生了逃逸分析，就看new的对象是否有可能在方法外被调用
 */
public class EscapeAnalysis {

    public EscapeAnalysis obj;

    /*
        方法返回EscapeAnalysis对象，发生逃逸
     */
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /*
        赋值给成员属性，发生逃逸
     */
    public void setObj() {
        this.obj = new EscapeAnalysis();
    }

    /*
        对象作用域仅在方法内部，未发生逃逸
     */
    public void useEscapeAnalysis() {
        EscapeAnalysis obj = new EscapeAnalysis();
    }

    /*
        有可能引用成员变量的值，发生逃逸
     */
    public void useEscapeAnalysis1() {
        EscapeAnalysis obj = getInstance();
    }
}
