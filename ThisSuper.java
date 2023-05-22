//This is reference variable that refer to the current object
//Super is reference variable that used to refer parent class object
package com;
class This{
    int a;
    public int getA(){
        return a;

    }
    This(int a){
        this.a = a;
    }
        public int returnone(){
        return 1;

    }
}
class Super extends This{
    Super(int c){
        super(c);
        System.out.println("I am a constructor ");
    }

}
public class ThisSuper {
    public static void main(String[] args) {
        This t = new This(56);
        System.out.println(t.getA());
        Super s = new Super(65);
        System.out.println(s.getA());


    }
}
