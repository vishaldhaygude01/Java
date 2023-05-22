package com;
interface MyCamera{
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
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String Network);

}
class MyCellPhone{
    void callNumber(int PhoneNumber){
        System.out.println("Calling "+ PhoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MysmartPhone extends MyCellPhone implements MyWifi,MyCamera{
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
public class Defaultmethod {
    public static void main(String[] args) {
        MysmartPhone ms = new MysmartPhone();
        ms.recorded4KVideo();
        ms.takeSnap();
        String[] ar = ms.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }

    }
}
