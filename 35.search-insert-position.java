/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid;
        int pos = 0 ;
        while(low <= high) {
            mid = low + (high-low)/2;
            
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
                pos = mid;
            } else {
                low = mid + 1;
                pos = mid + 1;
            }
        }
        
        return pos;
    }
}
// @lc code=end

