/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
         return 0;
         
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int price:prices){
            min = Math.min(price,min);
            max = Math.max(price-min,max);
        }

        return max;
    }
}
// @lc code=end

