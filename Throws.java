package com;
//THE THROW KEYWORD IN JAVA IS USED TO EXPLICITLY THROW AN EXCEPTION FROM A METHOD OR ANY BLOCK OF CODE
public class Throws {
    public static int divide(int a, int b)throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c = divide(6,0);
            System.out.println(c);
        }
       catch(Exception e){
           System.out.println("Exception");
       }
    }
}
