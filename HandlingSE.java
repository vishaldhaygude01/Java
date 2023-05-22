package com;

import java.util.Scanner;

public class HandlingSE {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array of index");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try{
            System.out.println("The value of the array at the index entered is : " + marks[ind]);
            System.out.println("The value of the array-value number is : " + marks[ind]/number);

        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other exception is occured");
            System.out.println(e);
        }
    }
}
