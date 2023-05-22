//Access modifires are keyword in oop that set to accsesbility of class method object
package com;
class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class AccessModi {

    public static void main(String[] args) {
        MyEmployee vishal = new MyEmployee();
      //  vishal.id = 45;
      //  vishal.name = "vish";
       vishal.setName("vish");
       System.out.println(vishal.getName());
        vishal.setId(5);
        System.out.println(vishal.getId());




    }
}
