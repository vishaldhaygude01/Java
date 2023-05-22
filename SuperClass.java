/*


    SUPER CLASS---
    the parent class from which many subclasses can be created.all the subclasses
    have all the attribute and properties of parent class
 */
package com;
import java.util.*;
class HelloWorld{
    String name = "HelloWorld is the name ";
    void print(){
        System.out.println("This is the HelloWorld class ");
    }
}
class Hey extends HelloWorld{
    String name = super.name;
    void print(){
        super.print();
        System.out.println("This is the Hey class ");
        System.out.println(name);
    }
}
public class SuperClass {
    public static void main(String[] args) {
        Hey ob = new Hey();
        ob.print();
    }
}
