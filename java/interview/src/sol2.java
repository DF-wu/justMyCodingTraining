import java.util.*;
public class sol2 {
    public static void main(String[] args) {

        int[] res = countBits(3);
        System.out.println(Arrays.toString(res));

    }
    public static int[] countBits(int n) {

        if (n == 0 ) return new int[]{0};
        if (n == 1) return new int[]{0,1};

        int[] arr = new int[n+1];
        arr[0] = 0; arr[1] = 1;
        //find the power of two



        // init by 0

        // build up the reference

        int power = 1;
        ArrayList<Integer> ref = new ArrayList<Integer>();
        ref.add(0); ref.add(1);
        int orgSize = ref.size();
        while((int)Math.pow(2, power) <= n){
            // update the reference size
            orgSize = ref.size();
            //extend the reference
            for(int i = 0; i < orgSize; i++){
                ref.add(ref.get(i) + 1);
            }
            power++;
        }
        for(int i=0; i<=n; i++){
            arr[i] = ref.get(i);
        }
        return arr;
    }
}
