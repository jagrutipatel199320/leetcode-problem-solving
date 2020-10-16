/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s==null || s.length()==0)
        return true;

        int i = 0; int j = 0;

        while(j<s.length() && i <t.length()){
            if(s.charAt(j) == t.charAt(i)){
                i++;j++;
            }else{
                i++;
            }
        }

        return j == s.length();
    }
}
// @lc code=end

