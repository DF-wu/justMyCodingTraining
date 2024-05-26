public class sol7 {

    public static void main(String[] args) {
        System.out.println(
                maxProfitFee(new int[]{1,3,2,8,4,9}, 2)
        );
    }

    public  static int maxProfitFee(int[] prices, int fee) {
        // s0 = hold stock
        // s1 = no  hold stock & ready to buy
        // s0[n] = s1[n-1]  - prices[n] |  s0[n-1]
        // s1[n] = s0[n-1] + prices[n] - fee | s1[n-1]
        // init state : s0[0] = -prices[0] ,  s1[0] = Integer.Min //

        // spare a line for initial state
        int days = prices.length;
        int[][] dp = new int[days][2];
        //init
        dp[0] = new int[]{0,0};
        for (int i = 0; i < days; i++) {
            dp[i][0] = 0;
        }
        dp[0][0] = -prices[0]; dp[0][1] = 0;

        for (int day = 1; day < days ; day++) {
            dp[day][0] = Math.max(dp[day-1][1] - prices[day] , dp[day-1][0]);
            dp[day][1] = Math.max(dp[day-1][0] + prices[day] -fee,  dp[day-1][1]);

        }

        // end must not hold stocl
        return dp[days-1][1] ;

    }
}


