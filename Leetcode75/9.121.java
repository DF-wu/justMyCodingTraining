package Leetcode75;


// 121. Best Time to Buy and Sell Stock
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; 
        int minBuyPrice = Integer.MAX_VALUE;    
        for(int i=0; i < prices.length; i++){
            if(prices[i] < minBuyPrice){
                minBuyPrice = prices[i];
            }
            
            int currentProfit = prices[i] - minBuyPrice;
            
            if(currentProfit > profit){
                profit = currentProfit;
            }    
        }
        return profit;
    }
    
    
    
    
    
    
    
    // public int maxProfit(int[] prices) {
    //     int profit = -1;
    //         for(int i=0; i < prices.length; i++){
    //             for(int j=i;j < prices.length; j++){
    //                 if(prices[j] - prices[i] > profit){
    //                     profit = prices[j] - prices[i];
    //                 }
    //             }
    //         }
    //     return profit>0 ? profit : 0;
    // }
}