import java.util.HashMap;

/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length -1;

        while(numbers[first] + numbers[last] != target ){
            if(numbers[first] + numbers[last] < target){
                first++;
            }else{
                last--;
            }
        }
        int[] res = new int[2];
        res[0] = first+1;
        res[1] = last+1;

        return res;

    }
}
// @lc code=end

