/*
 * @lc app=leetcode id=1550 lang=java
 *
 * [1550] Three Consecutive Odds
 */

// @lc code=start
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i< arr.length - 2; i++){
            if(arr[i]%2 ==1 && arr[i+1]%2 == 1 && arr[i+2]%2 ==1)
            return true;
        }
        return false;
    }
}
// @lc code=end

