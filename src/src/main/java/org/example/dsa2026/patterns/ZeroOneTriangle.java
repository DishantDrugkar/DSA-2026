package org.example.dsa2026.patterns;

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int rows = scanner.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                if((i + j ) % 2 == 0){
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
