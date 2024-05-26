public class sol8 {
    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros"));
    }
    public static int minDistance(String word1, String word2) {
        // edge case
        if(word1.length() == 0 || word2.length() == 0) return Math.max(word1.length(), word2.length());

        int len1 = word1.length(), len2 = word2.length();
        // extend to represent the initial case with empty string;
        int[][] dp = new int[len1+1][len2+1];

        // init dp matrix
        for (int i = 0; i < len1+1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < len2+1; j++) {
            dp[0][j] = j;
        }
        // s1 = sub1 + e1; s2 = sub2 + e2;
        // if e1=e2 then result in (sub1,sub2)
//         if e1 != e2   =>  3 case of insert remove change
        // align with e2

        for (int i = 1; i < len1 +1; i++) {
            for (int j = 1; j < len2+1; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    //remove case: remove e1 from result
                    int case1 = dp[i-1][j] + 1;
                    // insert case: insert e2 to result
                    int case2 = dp[i][j-1] + 1;
                    // change case: change e1 to e2
                    int case3 = dp[i-1][j-1] + 1;

                    // find minimum from 3
                    int t1 = Math.min(case1, case2);
                    int res = Math.min(case3, t1);
                    dp[i][j] = res;

                }
            }
        }

        return  dp[len1][len2];
    }
}
