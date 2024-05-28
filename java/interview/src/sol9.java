package interview.src;
/*
746. Min Cost Climbing Stairs

 */
public class sol9 {
    public static void main(String[] args) {
        minCostClimbingStairs(new int[]{10,15,20});
        System.out.println(
                recursive(new int[]{1,100,1,1,1,100,1,1,100,1}, 10)
        );

    }
    public static int minCostClimbingStairs(int[] cost) {
        // dp[n] -> choose n  || not choose n
        // choose n = dp[n-2] + int[n]  || dp[n-1] + int[n]
        // not choose n = dp[n-1]
        // init case => dp[0] = int[0] , dp[1] = int[1]

        //end is the n+1 step
        int[] dp = new int[cost.length+1];
        dp[0] = cost[0] ; dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i-2] , dp[i-1]) + cost[i];

        }
        dp[cost.length] = Math.min(dp[cost.length-2], dp[cost.length-1]);

        System.out.println(dp[cost.length]);
        return dp[cost.length];

    }


    public static int recursive(int[] cost, int rest){
        if(rest <= 2 ) return cost[rest];
        return Math.min(recursive(cost, rest-1) , recursive(cost, rest-2)) + cost[rest];

    }
}
