package org.example.dsa2026.patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter No. of Cols : ");
        int cols = scanner.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
