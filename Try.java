package com;

public class Try {
    public static void main(String[] args) {
        int a = 500;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The result is  "+ a/b);
        }
        catch (Exception e){
            System.out.println("We are falied to divide . reason : ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
