package com.example.Interface;

/**
 * Created by mrpehlivan on 02/05/2017.
 *
 * DefaultMethodInterfaceExample
 */
public interface DefaultMethodUsageInterfaceExample {
    default void print() {
        System.out.println("Hi, I am working on the DefaultMethodUsageInterfaceExample as DEFAULT method.");
    }
}

/**
 * Created by mrpehlivan on 02/05/2017.
 *
 * DefaultMethodExampleClass
 */
class DefaultMethodExampleClass implements DefaultMethodUsageInterfaceExample {
    public void print() {
        DefaultMethodUsageInterfaceExample.super.print();
    }


    public static void main(String[] args) {
        DefaultMethodExampleClass defaultMethodExampleClass = new DefaultMethodExampleClass();
        defaultMethodExampleClass.print();
    }
}
