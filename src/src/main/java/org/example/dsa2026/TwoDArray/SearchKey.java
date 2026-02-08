package org.example.dsa2026.TwoDArray;

public class SearchKey {
    public static void main(String[] args) {

        int matrix[][] = { {1,2,3},
                           {4,5,6},
                           {7,8,9}
                         };

        int key = 5;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
              if( matrix[i][j] == key){
                  System.out.println("Key Found at Index : " + i + " , " + j);
              }
            }
        }


    }


}
