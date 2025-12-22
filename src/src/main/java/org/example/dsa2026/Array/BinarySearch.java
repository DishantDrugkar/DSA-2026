package org.example.dsa2026.Array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int key = 8;
        System.out.println(binarySearch(arr,key));
    }
    public static int binarySearch(int arr[], int key){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left + right) / 2;
            if(arr[mid] == key){
                return mid;
            } else if (key < arr[mid]) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
