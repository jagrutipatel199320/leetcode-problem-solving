/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        
        if(word.length() < 2) return true;
        if(word.toUpperCase().equals(word)) return true;
        System.out.println(word.substring(1));
        if(word.substring(1).toLowerCase().equals(word.substring(1))) return true;
        return false;
    }
}
// @lc code=end

