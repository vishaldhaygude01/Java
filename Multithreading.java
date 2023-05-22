package com;
//Multithreading is a java feature that allows concurrent execution of two or more parts of a program
//for maximum utilization of CPU
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("My cooking is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("Thread 2 chatting with her");
            System.out.println("I am bad");
            i++;

        }
    }
}
public class Multithreading {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
