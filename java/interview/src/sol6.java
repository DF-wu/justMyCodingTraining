public class sol6 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,3,0,2}));
    }
    public static int maxProfit(int[] prices) {
        // state change algo
        // spare for init state
        int[][] dp = new int[prices.length+1][3];
        // [0] = hold stock, [1] = cooldown, [2] = not hold && ready to buy
        dp[0][0] = -prices[0]; // after buying, pay money sad. // hold stock
        dp[0][1] = Integer.MIN_VALUE ; // lower base case    // cooldown
        dp[0][2] = 0; // not hold anything at first;         // not hold && ready to buy

        for (int d = 1; d <= prices.length; d++) {
            dp[d][0] = Math.max(dp[d-1][0], dp[d-1][2] - prices[d-1]);
            dp[d][1] = dp[d-1][0] + prices[d-1];
            dp[d][2] = Math.max(dp[d-1][1], dp[d-1][2]);

        }
        // last day must be cooldown or not hold;
        return Math.max(dp[prices.length][2], dp[prices.length][1]);
    }

}
