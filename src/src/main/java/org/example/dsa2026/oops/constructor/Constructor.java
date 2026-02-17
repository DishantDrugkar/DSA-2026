package org.example.dsa2026.oops.constructor;

public class Constructor {
    int id;
    int age;

    public Constructor(){
        System.out.println("Default Constructor");
    }

    public Constructor(int id, int age){
        this.id = id;
        this.age = age;
        System.out.println("Parametarized constructr");
    }
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        Constructor constructor1 = new Constructor(1,22);
    }

}
