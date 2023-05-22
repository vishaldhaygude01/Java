package com;
class Employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);

    }
    public int getsalary(){
        return salary;

    }

}

public class CustomClass {
    public static void main(String[] args) {
        Employee Vishal = new Employee();
        Vishal.id = 01;
        Vishal.name = "Vish";
        Vishal.salary = 34;
     //   System.out.println(Vishal.id);
     //   System.out.println(Vishal.name);
       Vishal.printdetails();
       int salary = Vishal.getsalary();
        System.out.println(salary);




    }
}
