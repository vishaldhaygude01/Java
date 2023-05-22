package com;

public class ExceptionEx3 {
    public static void main(String[] args) {
        try{
            int num= Integer.parseInt("xyz");
            System.out.println("num");
        }
        catch (NumberFormatException e){
            System.out.println("Number format exceptiom");
        }
    }
}

