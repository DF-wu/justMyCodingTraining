package Leetcode75;

import java.util.*;
// 205. Isomorphic Strings
class Solution_3 {
    public boolean isIsomorphic(String s, String t) {
        return false;
    }
    public static void main(String[] args) throws Exception {
        String s = "paper", t = "pepar";
        int length = s.length();
        
        HashMap<Character, Character> sstrmap = new HashMap<>();
        HashMap<Character, Character> tstrmap = new HashMap<>();
        


        // create a mapping structure
        for (int i = 0; i < length; i++) {
            sstrmap.put(s.charAt(i), t.charAt(i));
            tstrmap.put(t.charAt(i), s.charAt(i));    
        }
    
        HashSet<Character> svalueSet = new HashSet<>();
        svalueSet.addAll(sstrmap.values());
        HashSet<Character> tvalueSet = new HashSet<>();
        tvalueSet.addAll(tstrmap.values());

        if(svalueSet.size() != sstrmap.values().size()){
            System.out.println("false");
        }

        if(tvalueSet.size() != tstrmap.values().size()){
            System.out.println("false");
        }
        for (int i = 0; i < length; i++) {
            if(sstrmap.get(s.charAt(i)) != t.charAt(i)){
                System.out.println("false");
            }
        }
        System.out.println("true");

        
    }
}


