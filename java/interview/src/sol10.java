package interview.src;

public class sol10 {
    public static void main(String[] args) {
        System.out.println(numTilings(29));
    }
    public  static int numTilings(int n) {

        // review https://www.youtube.com/watch?v=S-fUTfqrdq8&t=618s
        // 3 cases
        long[][] dp = new long[n+1][3];
        int MOD = 1000000007;
        /*
            dp[i][0] =  dp[i-1][0]  + dp[i-2][0] + dp[i-1][1] + dp[i-1][2];
            dp[i][1] = dp[i-2][0] + dp[i-1][1]
            dp[i][2] = dp[i-2][0] + dp[i-1][2]

            for dp[i][1] number is totally same to dp[i][2]
            concluded:

            dp[i][0] = dp[i-1][0] + d[i-2][0]+ dp[i-1][0]*2
            dp[i][1] = dp[i-2][0] + dp[i-1][1]

        * */
        //init case
        // dp[0] only 1 way to fill tile
        dp[0] = new long[]{1,0,0}; dp[1] = new long[]{1,0,0};
        for (int i = 2; i < n+1; i++) {
            dp[i][0] = (dp[i-1][0] + dp[i-2][0] + dp[i-1][1] + dp[i-1][2]) % MOD;
            dp[i][1] = (dp[i-1][1] + dp[i-2][0]) % MOD;
            dp[i][2] = (dp[i-1][2] + dp[i-2][0]) % MOD;

        }
        return (int) (dp[n][0] % MOD);
    }

}
