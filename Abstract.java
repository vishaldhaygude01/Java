//Abstract defined is existing in thought as an idea without concrete existance
//ABSTRACTION IS THE HIDING THE DETAILS AND SHOWING ONLY FUNCTIONALITY TO THE USER
package com;
abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor of Parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
   abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent{
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class Child1 extends Parent{
    public void hey(){
        System.out.println("I am good");
    }


 }
public class Abstract {
    public static void main(String[] args) {
        Child c = new Child();

        c.greet();
        c.greet2();
        c.sayHello();

    }
}
