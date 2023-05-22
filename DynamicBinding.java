package com;
import java.io.*;
abstract class Shape1{
    private double height;
    private double width;
    public void setValues(double height,double width){
        this.height = height;
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public abstract double computeArea();
}
class Rectangle1 extends Shape1{
    public double computeArea(){
        return getHeight()*getWidth();
    }
}
class Triangle extends Shape1{
    public double computeArea(){
        return (getHeight()*getWidth())/2;
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        Shape1 shape;
        Rectangle1 rect = new Rectangle1();
        shape = rect;
        Shape1 o1 = new Rectangle1();
        shape.setValues(50,5);
        System.out.println("Area of the Rectangle: "+shape.computeArea());
        Triangle tri = new Triangle();
        shape = tri;
        shape.setValues(2,6);
        System.out.println("Area of Triangle: "+ shape.computeArea());

    }
}
