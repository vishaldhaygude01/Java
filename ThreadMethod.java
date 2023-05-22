package com;
/*
    Java provides built-in-support for multithreading programming .A multi-threaded program
    contains two or more parts that can run concurrently. Each part of such a program
    called a thread
 */
class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println("Thank you : ");

        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        while(true){
            System.out.println("My Thank You : ");
        }
    }

}

public class ThreadMethod {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        t2.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
