package org.example.dsa2026.oops.constructor;
class Zoo{
    String color = "White";
}
class B extends Zoo{
    String color = "Black";
    public void printColor(){
        System.out.println(this.color); // B class's color
        System.out.println(super.color); // parent class's color
    }
}
public class Animal {
    public static void main(String[] args) {
        B b = new B();
        b.printColor();
    }


}
