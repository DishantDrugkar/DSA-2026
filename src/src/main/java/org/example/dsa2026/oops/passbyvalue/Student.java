package org.example.dsa2026.oops.passbyvalue;

public class Student {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        value(a,b);
        System.out.println(a + ":" +b);
    }
    public static void value(int a, int b){
        a--;
        b--;
      //  System.out.println(a + ":" + b);
    }
}
