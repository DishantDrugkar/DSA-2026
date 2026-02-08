package org.example.dsa2026.Array.collgeWallah;

public class UniqueElement {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,3,2,1};
        System.out.println(unique(nums));
    }
    public static int unique(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    nums[i] = -1;
                    nums[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > -1){
                ans = nums[i];
            }
        }
        return ans;
    }
}
