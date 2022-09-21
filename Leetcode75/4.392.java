package Leetcode75;

import java.util.*;
// 392. Is Subsequence
class Solution_4 {
    public boolean isSubsequence(String s, String t) {
        
    if(s.equals("")) return true;
    if(t.equals("")) return false;
            
    //         init
    String currentSubString = t;
    for(int i = 0; i< s.length(); i++){
        if(currentSubString.length() ==0 && i != s.length()-1 ) return false;
        for(int j = 0; j < currentSubString.length(); j++ ){
//                 if find a letter in currentSubString
            if(currentSubString.charAt(j) == s.charAt(i)){
                currentSubString = currentSubString.substring(j+1);
                break;
            }

//                 handler if run out of currentSubString and still not found
            if(j == (currentSubString.length() - 1)){
                return false;
            }
        }
        
        if(currentSubString.length() == 0 && i != s.length() - 1) return false;
    }

    return true;
        
    }

}