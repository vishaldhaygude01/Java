package com;
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius(){
        return radius;

    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void setheight(int height){
        this.height = height;

    }



}
public class ACpractice {
    public static void main(String[] args) {
       Cylinder myCylinder = new Cylinder(15,10);
         myCylinder.setheight(15);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(10);
        System.out.println(myCylinder.getRadius());



    }
}
