/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String J, String S) {
        int res=0;
        for(char c : S.toCharArray()){
            if(J.indexOf(c) != -1){
                res++;
            }
        }
        return res;
    }
}
// @lc code=end

