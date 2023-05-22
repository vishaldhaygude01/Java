//In multiple inheritance one class can have more than one superclass and inherit from all parent class
package com;
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface {
    void meth3();
    void meth4();
}
interface ParentSampleInterface extends childSampleInterface{
    void meth5();
    void meth6();
}
class MySampleClass implements ParentSampleInterface{
    public void meth1(){
        System.out.println("Hey Meth1");
    }
    public void meth2(){

        System.out.println("Hey Meth2");
    }
    public void meth3(){
        System.out.println("Hey Meth3");
    }
    public void meth4(){
        System.out.println("Hey Meth4");
    }
    public void meth5(){
        System.out.println("Hey Meth5");
    }
    public void meth6(){
        System.out.println("Hey Meth6");
    }
}
public class Interface {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
        msc.meth5();
        msc.meth6();
    }
}
