package com;
class A1{
    void m1(){
        System.out.println("Inside A1's m1 method");
    }
}
class B1 extends A1{
    void m1(){
        System.out.println("Inside B1's m1 method");
    }
}
class C1 extends A1{
    void m1(){
        System.out.println("Inside C1's m1 method");
    }
}

public class RunPoly {
    public static void main(String[] args) {
        A1 a = new A1();
        B1 b = new B1();
        C1 c = new C1();
        A1 ref;
        ref = a;
        ref.m1();
        ref = b;
        ref.m1();
        ref = c;
        ref.m1();
    }
}
