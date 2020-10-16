import java.util.Arrays;


/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);

       int count = 0;
       int max = nums[nums.length - 1];

       for(int i=nums.length -2; i>=0; i--){
         if(count == 2) break;
         if(nums[i]<max){
           count++;
           max = nums[i];
         }
       }

       if(count == 2) return max;
       return nums[nums.length -1];
    }
    
      
    
}
// @lc code=end

