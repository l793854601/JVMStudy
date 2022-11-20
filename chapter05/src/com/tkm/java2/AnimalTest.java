package com.tkm.java2;

/*
    说明早期绑定和晚期绑定的例子
 */

class Animal {
    public void eat() {
        System.out.println("动物进食");
    }
}

interface Huntable {
    void hunt();
}

class Dog extends Animal implements Huntable {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void hunt() {
        System.out.println("捕捉耗子，多管闲事");
    }
}

class Cat extends Animal implements Huntable {


    public Cat() {
        //  早期绑定
        //  invokespecial #1 <com/tkm/java2/Animal.<init> : ()V>
        super();
    }

    public Cat(String name) {
        //  早期绑定
        //  invokespecial #2 <com/tkm/java2/Cat.<init> : ()V>
        this();
    }

    @Override
    public void eat() {
        //  早期绑定
        //  invokespecial #2 <com/tkm/java2/Animal.eat : ()V>
        super.eat();
        System.out.println("猫吃鱼");
    }

    @Override
    public void hunt() {
        System.out.println("捕捉耗子，天经地义");
    }

    public final void sleep() {
        System.out.println("猫睡觉");
    }
}

public class AnimalTest {

    public void showAnimal(Animal animal) {
        //  晚期绑定
        //  invokevirtual #2 <com/tkm/java2/Animal.eat : ()V>
        animal.eat();
    }

    public void showHunt(Huntable huntable) {
        //  晚期绑定
        //  invokeinterface #3 <com/tkm/java2/Huntable.hunt : ()V> count 1
        huntable.hunt();
    }

    public void showCat(Cat cat) {
        //  尽管是invokevirtual，但sleep()方法被final修饰，因此仍然为早期绑定
        //  invokevirtual #4 <com/tkm/java2/Cat.sleep : ()V>
        cat.sleep();
    }
}
