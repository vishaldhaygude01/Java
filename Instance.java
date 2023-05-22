//Instance keyword is used for the checking variable is containing a given type of object reference or not...
package com;
class  Parent1{}
class Child2 extends Parent1{}

public class Instance {
    public static void main(String[] args) {
        Child2 cobj = new Child2();
        if (cobj instanceof Parent1 )
            System.out.println("cobj is instance of Parent1");
        else
            System.out.println("cobj is not instance of Parent1");
        if(cobj instanceof Object)
            System.out.println("cobj is instance of object");
        else
            System.out.println("cobj is not an instance of object");
    }
}
