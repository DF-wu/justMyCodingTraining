package Leetcode75;

import java.util.*;
// 724. Find Pivot Index
class Solution_2 {
    public int[] pivotIndex(int[] nums) {
        return nums;
    }
    public static void main(String[] args) throws Exception {
        int nums[] = {1,2,3};
        int answ = 0;

        int pivot_index = 0;
        int leftsum = 0, rightsum = 0;
        ArrayList<Integer> runnungSum = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            runnungSum.add(sum);
        }
        
        for (pivot_index = 0; pivot_index < nums.length; pivot_index++) {
            leftsum = runnungSum.get(pivot_index) - nums[pivot_index];
            rightsum = runnungSum.get(nums.length-1) - runnungSum.get(pivot_index);
            if (rightsum == leftsum) {
                // find valid pivot index -> pivot
                answ = pivot_index;
            }else if( pivot_index == nums.length-1){
                // no valid pivot index found
                answ = -1;
            }else{
                // has not found pivot -> next pivot index
                continue;
            }
        
        }
        System.out.println("done");
        System.out.println(answ);

    }
}


