public class sol5 {
    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));

    }
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int res =0;
        int pivot_hold =0;
        for(int i=1; i< len;  i++){
            // if the profit > 0. add to max profit
            // if the profit <0. move to next day.
            int currday =i;

            int differenceFromYesterday = prices[currday] - prices[currday-1];
            if( differenceFromYesterday >0){
                // positive profit
                res += differenceFromYesterday;

            }else{
//                0 or negative profit
                pivot_hold = i;

            }
        }
        return  res;
    }



}
