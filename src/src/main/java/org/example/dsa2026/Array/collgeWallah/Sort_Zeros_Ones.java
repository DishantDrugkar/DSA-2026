package org.example.dsa2026.Array.collgeWallah;

public class Sort_Zeros_Ones {
    public static void main(String[] args) {
        int nums [] = {1,0,0,1,0,1,1,0,0,1,0};
        sort(nums);
    }
    public static void sort(int nums[]){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left] == 0){
                left++;
            } else if (nums[right] == 1) {
                right--;
            } else{
                int temp =nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        for(int num : nums){
            System.out.print(num + " , ");
        }
    }
}
