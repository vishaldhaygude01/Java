package com;
abstract class Shape{
    private double width;
    private double height;
    public Shape(double width,double height){
        this.width = width;
        this.height = height;
    }

    public final double getHeight() {
        return height;
    }

    public final double getWidth() {
        return width;
    }
    abstract double getArea();
}
class Rectangle extends Shape{
    public Rectangle(double width, double height){
        super(width, height);
    }
    final double getArea(){
        return this.getHeight()* this.getWidth();
    }
}
class Square extends Shape{
    public Square(double side){
        super(side,side);
    }
    final double getArea(){
        return this.getHeight()*this.getHeight();
    }
}
public class FinalInhe {
    public static void main(String[] args) {
        Shape s = new Rectangle(10,20);
        Shape s1 = new Square(11);
        System.out.println("Width of s :"+ s.getWidth());
        System.out.println("Height of s is :"+s.getHeight());
        System.out.println("Width of s1 :"+ s1.getWidth());
        System.out.println("Height of s1 is :"+s1.getHeight());
        System.out.println("Area of s is :"+s.getArea());
        System.out.println("Area of s1 is :"+s1.getArea());
    }
}
