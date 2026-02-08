package org.example.dsa2026.Array.collgeWallah;

public class TargetSum {
    public static void main(String[] args) {
        int nums[] = {4,6,3,5,8,2};
        int target = 7;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(nums[i] + " , " + nums[j]);
                    count++;
                }
            }
        }
        System.out.println("No. of Pairs are : " + count);
    }
}
