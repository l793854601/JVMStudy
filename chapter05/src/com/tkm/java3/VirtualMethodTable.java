package com.tkm.java3;

interface Friendly {
    void sayHello();
    void sayGoodbye();
}

class Dog {
    void sayHello() {

    }

    void sayGoodbye() {

    }

    @Override
    public String toString() {
        return "Dog";
    }
}

class Cat implements Friendly {

    public void eat() {

    }

    @Override
    public void sayHello() {

    }

    @Override
    public void sayGoodbye() {

    }

    protected void finalize() {

    }

    @Override
    public String toString() {
        return "Cat";
    }
}

class CorkerSpaniel extends Dog implements Friendly {
    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void sayGoodbye() {

    }
}

public class VirtualMethodTable {
}
