package com.tkm.java2;

/*
    //  StringIntern.java扩展
 */
public class StringIntern1 {
    public static void main(String[] args) {
        String s3 = new String("1") + new String("1");
        //  在字符串常量池中生成对象"11"
        String s4 = "11";
        //  此时字符串常量池中已经存在"11"
        String s5 = s3.intern();
        //  false
        System.out.println(s3 == s4);
        //  true
        System.out.println(s4 == s5);
    }
}
