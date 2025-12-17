package org.example.dsa2026.patterns;

import java.util.Scanner;

public class InvertedHalfPyramifWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int rows = scanner.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
