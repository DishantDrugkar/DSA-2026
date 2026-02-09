package org.example.dsa2026.Array.collgeWallah;

public class SquaresOfEachNumberInArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        squares(nums);
    }
    public static void squares(int nums[]){
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
