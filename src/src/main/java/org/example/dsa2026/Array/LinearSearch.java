package org.example.dsa2026.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,0,3,2,3,4};
        int key = 2;
        System.out.println(linearSearch(arr,key));
    }
    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
