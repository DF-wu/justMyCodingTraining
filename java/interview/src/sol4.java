import  java.util.*;

public class sol4 {
    public static void main(String[] args) {
        longestCommonSubsequence("abcde", "ace");
    }

    public static int longestCommonSubsequence(String text1, String text2) {
//        from tail
//        LCS = (sub1 ,sub2 )+ last char | sub1, sub2 | sub1 ,s2 | s1 , sub2
        // extent 1 col and row is for save init condition
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i=0; i<text1.length(); i++){
            dp[i][0] = 0;
        }
        for (int i = 0; i < text2.length(); i++) {
            dp[0][i] = 0;
        }

//        fillup
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    // e1 = e2
                    // previous result +1
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    //e1 != e2
                    // chose longer substring one
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);

                }
            }

        }
        return dp[text1.length()-1][text2.length()-1];
    }
}
