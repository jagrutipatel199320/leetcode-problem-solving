/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int num) {
        return (num>0) && (Math.log10(num)/Math.log10(4) %1 ==0);
    }
}
// @lc code=end

