import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
       if (nums.length == 1)
       return nums[0];

       Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       int max = 0;
       int num = nums[0];
       for (int i =0; i< nums.length; i++) {
           if(!map.containsKey(nums[i]))
            map.put(nums[i], 0);
            else{
                if(max < map.get(nums[i]) + 1){
                    max =  map.get(nums[i]) + 1;
                    num = nums[i];
                }
                map.put(nums[i],map.get(nums[i]) + 1);
            }
         
       }


       return num;
    }
}
// @lc code=end

