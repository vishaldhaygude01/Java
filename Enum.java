package com;
import java.util.Scanner;
enum Day{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
}
public class Enum {
    Day day;
    public Enum(Day day){
        this.day = day;
    }
    public void dayIsLike(){
        switch (day){
            case Monday:
                System.out.println("Mondays are bad");
                break;
            case Friday:
                System.out.println("Fridays are better");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Weekends are the best");
                break;
            default:
                System.out.println("Midweek days are so-so");
                break;
        }
    }
    public static void main(String[] args) {
        String str = "Saturday";
        Enum E1 = new Enum(Day.valueOf(str));
        E1.dayIsLike();
    }
}
