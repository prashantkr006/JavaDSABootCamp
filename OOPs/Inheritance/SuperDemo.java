package com.prashant.OOP.Inheritance;

class A{
    public A(int i) {
        System.out.println("int A int");
    }

    public A() {
        System.out.println("in A");
    }

    public int methodAdd(int a , int b) {
        return a + b;
    }
}
class B extends A {

    public B(int i, int b) {
        System.out.println("in B int");
    }

    public void sum(int a, int b) {
        System.out.println(super.methodAdd(a, b));
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B obj = new B(5, 6);
        obj.sum(6, 4);
    }
}
