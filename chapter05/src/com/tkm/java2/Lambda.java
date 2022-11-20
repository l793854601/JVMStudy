package com.tkm.java2;

@FunctionalInterface
interface Func {
    public boolean func(String str);
}

public class Lambda {
    public void lambda(Func func) {

    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func1 = s -> s.length() > 0;
        //  invokedynamic #4 <func, BootstrapMethods #0>
        lambda.lambda(func1);

        Func func2 = lambda::test;
        //  invokedynamic #7 <func, BootstrapMethods #1>
        lambda.lambda(func2);

        Func func3 = new Func() {
            @Override
            public boolean func(String str) {
                return false;
            }
        };
        //  invokevirtual #5 <com/tkm/java2/Lambda.lambda : (Lcom/tkm/java2/Func;)V>
        lambda.lambda(func3);
    }

    public Boolean test(String str) {
        return str.equals("tkm");
    }
}
