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

    static int sum(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
}
/**
 * Created by mrpehlivan on 02/05/2017.
 *
 * StaticMethodUsageClassExample
 */
class StaticMethodUsageClassExample implements StaticMethodUsageInterfaceExample{
    public void  print(){
        System.out.println("Hi, I am working on the StaticMethodUsageClassExample as STATIC method.");
    }

    public static void main(String[] args) {
        StaticMethodUsageClassExample s = new StaticMethodUsageClassExample();
        s.print();
        StaticMethodUsageInterfaceExample.sum(3,4);
        StaticMethodUsageInterfaceExample.print();
    }
}
