package com;
import java.util.Scanner;
class publication{
    int total;
    public void salecopy(int a){

    }
    public void setprice(){

    }
    Scanner get=new Scanner(System.in);
}

class book extends publication{
    String title,author;
    int price,ordercopies,total;
    public void setprice() {
        System.out.println("enter book name=");
        title=get.nextLine();
        System.out.println("enter the author name");
        author=get.nextLine();
        System.out.println("enter the price");
        price=get.nextInt();
        System.out.println("enter the no. of copies");
        ordercopies=get.nextInt();
    }
    public void salecopy(int a){
        System.out.println("book name="+title);
        System.out.println("author name="+author);
        System.out.println("price of book="+price);
        System.out.println("Number of copies="+ordercopies);
    }
    public void totalsale(){
        System.out.println("total sale="+(price*ordercopies));
    }
}

class magzine extends publication{
    String title;
    String current_issue;
    int price,orderqty;
    public void setprice() {
        System.out.println("enter magnize name=");
        title=get.next();
        System.out.println("enter the price of maganize=");
        price=get.nextInt();
        System.out.println("enter the quatity=");
        orderqty=get.nextInt();
        System.out.println("enter the current_issue=");
        current_issue=get.next();
    }
    public void salecopy(int a) {
        System.out.println("maganize name=" +title);
        System.out.println("current issue of magazine=" +current_issue);
        System.out.println("price of magazine=" +price);
        System.out.println("quantity of magnize=" +orderqty);
        System.out.println("Total sale=" +(price*orderqty));
        System.out.println("you will received " + current_issue+" issue magnize");
    }
}

public class Polymorphism_Ass2 {
    public static void main(String[] args){
        book o1=new book();
        magzine o2=new magzine();
        o1.setprice();
        o1.salecopy(5);
        o1.totalsale();
        o2.setprice();
        o2.salecopy(4);
    }
}




