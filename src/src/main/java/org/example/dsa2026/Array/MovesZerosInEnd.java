package org.example.dsa2026.Array;

public class MovesZerosInEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};

        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        //fill remaining zeros
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
