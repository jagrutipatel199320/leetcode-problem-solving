/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length ==0) return;

        int pos = 0;
        for(int num : nums){
            if(num != 0)
            nums[pos++] = num;
        }

        while(pos<nums.length){
            nums[pos++]=0;
        }
    }
}
// @lc code=end

