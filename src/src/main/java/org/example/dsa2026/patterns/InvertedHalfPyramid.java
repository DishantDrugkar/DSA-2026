package org.example.dsa2026.patterns;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int rows = scanner.nextInt();

        for(int i = rows; i>= 1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
