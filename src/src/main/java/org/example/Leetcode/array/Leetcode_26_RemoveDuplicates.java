package org.example.Leetcode.array;

public class Leetcode_26_RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3,3};  // no of unique elements are 3
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int nums[]){
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
