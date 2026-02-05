package org.example.practice.Array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int nums[] = {1,2,2,3,4,4,5,6,6};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int nums[]){
        int i =0;
        for(int j=0; j<=nums.length-1; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
