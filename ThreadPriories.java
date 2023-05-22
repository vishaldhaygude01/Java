package com;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 15;
    //    while(true){
      //      System.out.println("Thank you : " + this.getName());
      //  }
    }
}
public class ThreadPriories {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Vishal1");
        MyThr1 t2 = new MyThr1("Vishal2");
        MyThr1 t3 = new MyThr1("Vishal3");
        MyThr1 t4 = new MyThr1("Vishal4");
        MyThr1 t5 = new MyThr1("Vishal5(most Important");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
