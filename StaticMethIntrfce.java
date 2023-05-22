package com;
interface  NewInterface{
    static void hello(){
        System.out.println("Hello,new static method hero");
    }
    void overridingMethod(String str);
}

public class StaticMethIntrfce implements NewInterface {
    public static void main(String[] args) {
        StaticMethIntrfce interfacedemo = new StaticMethIntrfce();
        NewInterface.hello();
        interfacedemo.overridingMethod("Hello, overrides method here");
    }
    public void overridingMethod(String str){
        System.out.println(str);
    }
}