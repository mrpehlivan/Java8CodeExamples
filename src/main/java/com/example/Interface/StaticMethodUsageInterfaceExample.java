package com.example.Interface;

/**
 * Created by mrpehlivan on 02/05/2017.
 *
 * StaticMethodUsageInterfaceExample
 */
public interface StaticMethodUsageInterfaceExample {
    static void print(){
        System.out.println("Hi, I am working on the StaticMethodUsageInterfaceExample as STATIC method.");
    }
}
/**
 * Created by mrpehlivan on 02/05/2017.
 *
 * StaticMethodUsageClassExample
 */
class StaticMethodUsageClassExample implements StaticMethodUsageInterfaceExample{
    public void  print(){
        StaticMethodUsageInterfaceExample.print();
    }

    public static void main(String[] args) {
        StaticMethodUsageClassExample s = new StaticMethodUsageClassExample();
        s.print();
    }
}
