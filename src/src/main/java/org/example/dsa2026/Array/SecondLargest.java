package org.example.dsa2026.Array;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {3,2,1,4,5,5};
        System.out.println("The Largest Element is : " + getLargest(arr));
        System.out.println("The Second Largest Element is : " + getSecLargest(arr));
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

    public static int getSecLargest(int arr[]){
        int max = getLargest(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i] = 0;
            }
        }
        int secMax = getLargest(arr);
        return secMax;
    }

}
