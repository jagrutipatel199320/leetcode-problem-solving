/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0 || s == " ")
        return 0;
        String str = s.trim();
        String[] strArray = str.split(" ", 0);
        
        return strArray[strArray.length -1].length();
    }
}
// @lc code=end

