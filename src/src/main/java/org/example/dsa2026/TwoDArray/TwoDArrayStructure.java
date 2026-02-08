package org.example.dsa2026.TwoDArray;

import java.util.Scanner;

public class TwoDArrayStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows : ");
        int rows = sc.nextInt();
        System.out.print("Cols : ");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
