/*
 * @lc app=leetcode id=1518 lang=java
 *
 * [1518] Water Bottles
 */

// @lc code=start
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int i = 1;
        while(i<=numBottles){
            if(i%numExchange == 0) numBottles++;

            i++;
        }
        return numBottles;
    }
}
// @lc code=end

