/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i =0; i<nums.length; i++){
            sum += nums[i];

            if(max < sum)
            max = sum;

            if(sum < 0)
            sum = 0;
        }
        return max;
    }
}
// @lc code=end

