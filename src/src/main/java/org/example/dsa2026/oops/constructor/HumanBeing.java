package org.example.dsa2026.oops.constructor;

public class HumanBeing {
    public static void main(String[] args) {
        System.out.println(Human.name);
    }
}
class Human{
    static String name = "SBI";
    public Human(String name){
        System.out.println("Hello");
    }
}
class Man extends Human{

    public Man(String name) {
        super(name);
    }
}