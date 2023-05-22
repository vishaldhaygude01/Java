package com;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 15;
        System.out.println("Hey! Thanks ");
   //     while(true){
     //       System.out.println("I am a thread");
       // }
    }
}
public class ThrConstructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Vishal");
        t.start();
        System.out.println("The id of the thread " + t.getId());
    }
}
