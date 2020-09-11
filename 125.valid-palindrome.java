/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0)
        return true;

        StringBuilder r = new StringBuilder();
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        String str1 = str.toLowerCase();
        r.append(str1);
        r = r.reverse();

       

        if(str1.equals(r.toString()))
        return true;
        else
        return false;

    }
}
// @lc code=end

