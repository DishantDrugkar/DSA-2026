package org.example.Leetcode.array;

public class Leetcode_35_SearchInsertPosition {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsertPosition(nums,target));
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
    public static int searchInsertPosition(int nums[], int target){
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return left;
    }
}
