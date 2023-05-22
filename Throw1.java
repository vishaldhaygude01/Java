package com;

public class Throw1 {
    static void fun(){
        try{
            throw new NullPointerException("Demo");
        }
        catch (NumberFormatException e){
            System.out.println("Caught inside fun().");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            fun();
        }
        catch(NumberFormatException e){
            System.out.println("Caught inside main");
        }
    }
}
