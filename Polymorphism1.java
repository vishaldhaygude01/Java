//POLYMORPHISM MEANS MANY FORMS AND IT OCCURS WHEN WE HAVE MANY CLASSES THAT ARE RELATED EACH OTHER
//BY INHERITANCE
package com;
class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says : wee wee");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says : bow bow");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Animal A = new Animal();
        Pig P = new Pig();
        Dog D = new Dog();
        A.animalSound();
        P.animalSound();
        D.animalSound();
    }
}
