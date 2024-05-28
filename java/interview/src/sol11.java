package interview.src;

import java.util.*;

public class sol11{
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
    public static int singleNumber(int[] nums) {
        //my idea : hashmap done
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int n: nums ) {
            if (map.containsKey(n)){
                map.remove(n);
            }else{
                map.put(n,1);
            }
        }

        int ans = (Integer)map.keySet().toArray()[0];
        return ans;

    }
}
