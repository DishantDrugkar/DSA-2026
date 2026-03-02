package org.example.Leetcode.array;

public class Leetcode_1929_ConcatenationArray {
    public static void main(String[] args) {
        int nums[] = {1,2,1};
       int result[] = concatenationArray(nums);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] concatenationArray(int nums[]){
        int n = nums.length;
        int ans[] = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
