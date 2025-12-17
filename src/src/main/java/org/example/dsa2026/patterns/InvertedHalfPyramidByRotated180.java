package org.example.dsa2026.patterns;

import java.util.Scanner;

public class InvertedHalfPyramidByRotated180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int rows = scanner.nextInt();

        for(int i=1; i<=rows; i++){
            // inner loop -> spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print("   ");
            }
            //inner loop -> stars
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
