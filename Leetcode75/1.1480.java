package Leetcode75;

import java.util.*;
//  1. 1480. Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        
        int sum = 0;
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;
            ans[i] = sum;
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        int nums[] = {1,2,3,4};
        int sum = 0;
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;
            ans[i] = sum;
        }
        
    }
}


