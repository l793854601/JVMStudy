package com.tkm.java1;

public class OperandStackTest {

    /*
        //  将15压入操作数栈（入栈）
        0 bipush 15
        //  将操作数栈顶元素（15）取出（出栈），保存在局部变量表索引为1的位置
        //  局部变量表索引为0的位置存放this（此方法为实例方法）
        2 istore_1
        //  将8压入操作数栈（入栈）
        3 bipush 8
        //  将操作数栈顶元素（8）取出（出栈），保存在局部变量表索引为2的位置
        5 istore_2
        //  将局部变量表中索引为1的元素（15）放入操作数栈（入栈）
        6 iload_1
        //  将局部变量表中索引为2的元素（8）放入操作数栈（入栈）
        7 iload_2
        //  此时操作数栈元素为：8、15
        //  将操作数栈的前两个元素（8、 15）取出（入栈），相加，结果（23）并放入操作数栈（入栈）
        8 iadd
        //  将操作数栈顶元素（23）取出（出栈），保存在局部变量表索引为3的位置
        9 istore_3
       10 return
     */
    public void testAddOperation() {
        byte i = 15;
        int j = 8;
        int k = i + j;
    }

    /*
        //  将局部变量表索引为0的元素（this）放入操作数栈
        //  getSum为实例方法，需要使用this
        0 aload_0
        //  执行getSum
        //  其结果会被放入操作数栈
        1 invokevirtual #2 <com/tkm/java1/OperandStackTest.getSum : ()I>
        //  将操作数栈栈顶元素（getSum的结果）保存在操作数栈索引为1的位置
        4 istore_1
        5 bipush 10
        7 istore_2
        8 return
     */
    public void testGetSum() {
        int i = getSum();
        int j = 10;
    }

    public int getSum() {
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    //  i++与++i的区别
    public void add() {
        //  第11类问题
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        //  第2类问题
        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;

        //  第3类问题
        int i7 = 10;
        i7 = i7++;

        int i8 = 10;
        i8 = ++i8;

        //  第4类问题
        int i9 = 10;
        int i10 = i9++ + ++i9;
    }
}
