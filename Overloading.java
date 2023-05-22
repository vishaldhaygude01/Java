package com;
//Overloading is the method same function but different parameters
public class Overloading {
    static void tellJoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }
    static void foo(){
        System.out.println("Good Morning bro !");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " bro !");
    }
    static void foo(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        tellJoke();
        foo();
        foo(5);
        foo(4,8);
    }
}
