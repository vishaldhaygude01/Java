//WHEN METHOD IS DECLARED WITH STATIC KEYWORD IS CALLED STATIC METHOD...
package com;
class Student {
    String name;
    int rollno;
    static String cllgname;
    static int counter = 0;
    public Student(String name){
        this.name = name;
        this.rollno = setRollNo();
    }
    static int setRollNo(){
        counter++;
        return counter;
    }
    static void setcllg(String name){
        cllgname = name;
    }
    void getStudentInfo() {
        System.out.println("name : " + this.name);
        System.out.println("rollno: " + this.rollno);
        System.out.println("cllgname : " + cllgname);
    }
}
public class Static {
    public static void main(String[] args) {
    Student.setcllg("XYZ");
    Student s1 = new Student("vish");
    Student s2 = new Student("om");
    s1.getStudentInfo();
    s2.getStudentInfo();
    }
}
 /*   static int a = 10;
    static int b;
    static{
        System.out.println("Static block initialized");
        b = a * 4;
    }
    public static void main(String[] args) {
        System.out.println("From main");
        System.out.println("value of a "+ a);
        System.out.println("Value of b "+ b);
    }
}*/
