/*
 * @lc app=leetcode id=1502 lang=java
 *
 * [1502] Can Make Arithmetic Progression From Sequence
 */

// @lc code=start
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length <3){
            return true;
        }
        Arrays.sort(arr);
        int diff = Math.abs(arr[0] - arr[1]);
        for(int i = 1; i< arr.length-1; i++){
            if(Math.abs(arr[i] - arr[i+1]) != diff){
                return false;
            }


        }
        return true;
    }
}
// @lc code=end

