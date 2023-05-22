package com;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }

}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void Speak(){
        System.out.println("Hey");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class Practice1 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        Human H = new Human();
        H.eat();

        Monkey M = new Human();
        M.jump();



    }
}
