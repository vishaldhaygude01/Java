//IT IS EMPTY INTERFACE (NO FIELD , NO METHODS)
package com;
import java.util.Scanner;
public class MarkerInterface implements Cloneable {
    int age;
    String name;
    public MarkerInterface (String name, int age){
        this.age = age;
        this.name = name;
    }
    public void display() {
        System.out.println("Name of the student is: "+name);
        System.out.println("Age of the student is: "+age);
    }
    public static void main (String args[]) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        MarkerInterface obj = new MarkerInterface(name, age);
        MarkerInterface obj2 = (MarkerInterface) obj.clone();
        obj2.display();
    }
}