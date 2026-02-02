package org.example.practice.Array;

public class LargestElement{
    public static void main(String[] args) {
        int arr[] = {2,4,8,8,3,5,7};
        System.out.println("Largest Element : " + getLargest(arr));
        System.out.println("Second Largest Element : " + getSecLargest(arr));
    }
    public static int getLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
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
