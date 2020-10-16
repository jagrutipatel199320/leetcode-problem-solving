/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0) return 0;
        int res = 1;
        int temp = nums[0];
        for(int i =0; i< nums.length; i++)
        {   
            if(temp != nums[i]){
                nums[res] = nums[i];
                temp = nums[i];
                res++;
            }
            
        }
        return res;
    }
}
// @lc code=end

