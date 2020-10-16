/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        for (i = 1; i<=n;i++)
        n=n-i;

        return i-1;
    }
    
}
// @lc code=end

