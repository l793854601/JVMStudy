package com.tkm.java2;

/*
    主线程的虚拟机栈：
        main()栈帧：
        局部变量表：（args、customer）
        操作数栈

    customer：
    对象头：运行时元数据（哈希值、GC分代年龄、锁状态标志...）
           类型指针
    实例数据：父类的实例数据
            本类的实例数据（id、name、account、gender）
    对齐填充
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
    }
}
