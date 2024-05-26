import java.util.*;
/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class sol1 {
    static long times = 0;

    public static void main(String[] args) {
        long start = 9126759025126654655L;
        long time  = System.currentTimeMillis();
        System.out.println(guessNumber(4126759025126654655L));
        System.out.println(times);
        System.out.println(System.currentTimeMillis() - time);
    }
    public static int guess(long num){
        long  target = 1702766719;
        if(num == target) return 0;
        if(num > target ) return -1;
        return 1;
    }
    public static long guessNumber(long n) {

        long left= 1, right = n;
        while(left<right){
            long mid = (right + left ) /2;
            if(guess(mid) == 0) return mid;
            if(guess(mid) == -1){
                right = mid;
            }else {
                left = mid + 1;
            }
            times++;
        }
        return left;

    }
}
