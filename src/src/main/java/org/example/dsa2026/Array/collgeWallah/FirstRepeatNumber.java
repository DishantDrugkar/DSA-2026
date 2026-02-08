package org.example.dsa2026.Array.collgeWallah;

public class FirstRepeatNumber {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,3,4};
        System.out.println(repeatNumber(nums));
    }
    public static int repeatNumber(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
