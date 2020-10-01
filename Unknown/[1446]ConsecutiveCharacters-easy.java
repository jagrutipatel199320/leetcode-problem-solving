/*
 * @lc app=leetcode id=1446 lang=java
 *
 * [1446] Consecutive Characters
 */

// @lc code=start
class Solution {
    public int maxPower(String s) {
       int max = 1; int count =1;

        for(int i =0; i< s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }else{
                max = Math.max(count,max);
                count = 1;
            }
        }

        return Math.max(max,count);
    }
}
// @lc code=end

