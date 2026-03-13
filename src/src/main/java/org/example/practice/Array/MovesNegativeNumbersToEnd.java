package org.example.practice.Array;

public class MovesNegativeNumbersToEnd {
    public static void main(String[] args) {
        int nums[] = {2,-1,3,-4,1,-3};
        // [2,3,1,-1,-4,-3]
        movesNumbers(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void movesNumbers(int nums[]){
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                nums[index] = nums[i];
                index++;
            }
        }
    }
}
