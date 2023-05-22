package com;
//It is defined wrapping up data under single unit
//the meaning is make sure that sensitive data hidden from the users
class Encapsulate{
    private String geekName;
    private int geekRoll;
    private int geekAge;

    public int getGeekAge() {
        return geekAge;
    }

    public int getGeekRoll() {
        return geekRoll;
    }

    public String getGeekName() {
        return geekName;
    }

    public void setGeekName(String newName) {
        geekName = newName;
    }

    public void setGeekAge(int newAge) {
        geekAge = newAge;
    }

    public void setGeekRoll(int newRoll) {
        geekRoll = newRoll;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Encapsulate en = new Encapsulate();
        en.setGeekName("Vishal");
        en.setGeekAge(19);
        en.setGeekRoll(1101);
        System.out.println("Geeks name is " + en.getGeekName());
        System.out.println("Geeks age is " + en.getGeekAge());
        System.out.println("Geeks roll no is " + en.getGeekRoll());

    }
}
