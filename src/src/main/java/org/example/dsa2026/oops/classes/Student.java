package org.example.dsa2026.oops.classes;

import java.util.Scanner;

public class Student {
    public static class StudentProperty{
        int rollNo;
        String name;
        String domain;
    }
    public static void main(String[] args) {
        StudentProperty studentProperty = new StudentProperty();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No of Student : ");
        studentProperty.rollNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name of the Student : ");
        studentProperty.name = scanner.nextLine();
        System.out.print("Enter the Domain : ");
        studentProperty.domain = scanner.nextLine();

        System.out.println("---------- STUDENT DETAILS ----------");
        System.out.println("Roll No : " + studentProperty.rollNo);
        System.out.println("Name : " + studentProperty.name);
        System.out.println("Domain : " + studentProperty.domain);
    }
}
