//AN EXCEPTION IS AN UNWANTED OR UNEXPECTED EVENT OCCURS DURING EXECUTION OF A PROGRAM
package com;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am toString";
    }
    public String getMessage(){
        return "I am getMessage";
    }
}

public class ExceptionC {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        a= sc.nextInt();
        if(a<9){
            try{
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }

    }
}
