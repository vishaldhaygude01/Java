
package com;
class Complex{
    private double re,im;
    public Complex(double re, double im){
        this.re = re;
        this.im = im;
    }
    //COPY CONSTRUCTOR
    Complex(Complex c){
        System.out.println("Copy constructor called ");
        re = c.re;
        im = c.im;
    }
    public String toString(){
        return "(" + re + " + " + im + " i)";
    }
}
public class CopyCons {
    public static void main(String[] args) {
        Complex c1 = new Complex(10,15);
        Complex c2 = new Complex(c1);
        Complex c3 = c2;
        System.out.println(c2);



    }
}
