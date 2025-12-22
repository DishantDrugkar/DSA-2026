package org.example.dsa2026.Array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,4,5};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int arr[]){
        int i = 0;
        for(int j=0;j<arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
