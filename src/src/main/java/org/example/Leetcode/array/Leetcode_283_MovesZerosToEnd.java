package org.example.Leetcode.array;

public class Leetcode_283_MovesZerosToEnd {
    public static void main(String[] args) {
        int nums[] = {1,0,2,3,0,4,0,0,3};
        movesZeros(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void movesZeros(int nums[]){
       int index = 0;
       for(int i=0; i<nums.length; i++){
           if(nums[i] != 0){
               nums[index] = nums[i];
               index++;
           }
       }
       while(index < nums.length){
           nums[index] = 0;
           index++;
       }

    }
}
