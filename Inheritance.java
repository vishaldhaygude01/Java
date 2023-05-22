//ONE CLASS IS ALLOWED TO INHERIT THE FEATURES FROM ANOTHER CLASS CALLED INHERITANCE
//THE CLASS WHOSE FEATURES ARE INHERITED ARE CALLED SUPERCLASS
//THE CLASS INHERIT OTHER CLASS CALLED SUBCLASS
package com;
class Base {
    public int x;

    public int getX() {

        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x now ");
        this.x = x;
    }
}

    class Derived extends Base {
        public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public class Inheritance {
        public static void main(String[] args) {
            Base b = new Base();
            b.setX(4);
            System.out.println(b.getX());
            Derived d = new Derived();
            d.setX(44);
            d.setY(10);
          //  System.out.println(d.getY());
            System.out.println(d.getX());


        }
}


