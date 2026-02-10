package org.example.dsa2026.Array.collgeWallah;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {2,1,3,10,15};
        int result[] = makePrefixSum(arr);
        for(int i=0; i< result.length; i++){
            System.out.print(result[i] + " , ");
        }
    }
    public static int[] makePrefixSum(int arr[]){
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}
