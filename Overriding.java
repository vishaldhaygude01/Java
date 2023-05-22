//If child class implements the same method present in the parent class again is called overriding
package com;
class A{
    public int vishal(){
        return 1;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");

    }
}
class B extends A{
    public void meth2(){
        System.out.println("I am method 2 of class B ");

    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();


    }
}
