package org.example.dsa2026.Array.collgeWallah;
// 2,4,6,8,1,3,5,7
public class Sort_Even_Odd_Numbers {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
sortNumbers(nums);
    }
    public static void sortNumbers(int nums[]){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left] % 2 == 0){
                left++;
            } else if (nums[right] % 2 == 1) {
                right--;
            }else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
