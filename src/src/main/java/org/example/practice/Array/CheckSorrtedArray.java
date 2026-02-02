package org.example.practice.Array;

public class CheckSorrtedArray {
    public static void main(String[] args) {
        int arr[] = {3,1,4,6,2,7,4,8,5,3};
        System.out.println(sortedArray(arr));
    }
    public static boolean sortedArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
