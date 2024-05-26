public class sol3 {
    /*
    * Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
    * */
    public static void main(String[] args) {
        rob(new int[]{114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240});
    }
    public static int rob(int[] nums) {
        // dp means the max money we can get from the first i houses
        int[] dp = new int[nums.length];
        // init
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);


        for(int i=2; i< nums.length; i++){
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }
        return dp[nums.length-1];
    }

}
