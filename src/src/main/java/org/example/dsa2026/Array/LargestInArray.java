package org.example.dsa2026.Array;

public class LargestInArray {
    public static void main(String[] args) {
        int arr[] = {3,2,1,4,5};
        System.out.println("The Largest Element is : " + getLargest(arr));
    }
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
