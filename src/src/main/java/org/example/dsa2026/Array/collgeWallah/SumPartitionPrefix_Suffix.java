package org.example.dsa2026.Array.collgeWallah;

public class SumPartitionPrefix_Suffix {
    public static void main(String[] args) {
       int arr[] = {6,2,3,4,1};
        System.out.println("Equal Partition : " + equalSum(arr));
    }
    public static int ArraySum(int arr[]){
        int totalSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }

    static boolean equalSum(int arr[]){
        int totalSum = ArraySum(arr);
        int prefSum = 0;
        for(int i=0; i<arr.length; i++){
            prefSum = prefSum + arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }
}
