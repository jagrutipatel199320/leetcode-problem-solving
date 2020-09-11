/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        
        return (n>0) && (Math.log10(n))/Math.log10(3) % 1 == 0;
    }


   
}
// @lc code=end

