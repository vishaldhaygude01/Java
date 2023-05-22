package com;
public class ExceptionEx2 {
    public static void main(String[] args) {
        try{
            int a[] = new int[10];
            //array has only 10 elements
            a[11] = 9;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" ArrayIndexOutOfBounds");
        }
    }
}

