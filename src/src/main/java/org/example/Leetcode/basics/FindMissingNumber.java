package org.example.Leetcode.basics;

public class FindMissingNumber {
    public static void main(String[] args) {
        int nums[] = {5,4,2,1,0};

        System.out.println(MissingNumber(nums));
    }
    public static int MissingNumber(int nums[]){
        int n = nums.length;
        int expectedSum = n * (n+1) / 2;
        int actualSum = 0;
        for(int i=0; i<n; i++){
            actualSum = actualSum + nums[i];
        }
        return expectedSum - actualSum;
    }
}
