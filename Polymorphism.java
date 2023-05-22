package com;
//If ONE TASK IS PERFORMED IN DIFFRENT WAYS KNOWN AS POLYMORPHISM
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet() {
        System.out.println("Good Morning");
    }
    default void recorded4KVideo(){
        greet();
        System.out.println("Recorded in 4K video");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String Network);

}
class MyCellPhone2{
    void callNumber(int PhoneNumber){
        System.out.println("Calling "+ PhoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MysmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Vishal","Omkar","Eklavya"};
        return networkList;
    }
    public void connectToNetwork(String Network){
        System.out.println("Connecting to "+ Network);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam = new MysmartPhone2();
       cam.recorded4KVideo();

       MysmartPhone2 s = new MysmartPhone2();
       s.callNumber(123);
       s.pickCall();
       s.getNetworks();
        String[] ar = s.getNetworks();
        for(String item : ar){
            System.out.println(item);

       }
    }
}
