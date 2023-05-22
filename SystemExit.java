package com;
//the java.lang.system.exit() method exits current program by terminating running JVM
//this method takes status code
import java.util.*;
import java.lang.*;
public class SystemExit {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=5){
                System.out.println("Exits...");
                System.exit(0);
            }
            else{
                System.out.println("arr["+i+"] = " + arr[i]);
            }
            System.out.println("End of the program");
        }
    }
}
