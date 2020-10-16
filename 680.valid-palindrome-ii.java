import org.graalvm.compiler.api.replacements.Fold;

/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
        public boolean validPalindrome(String s) {
            int start = 0;
            int end = s.length() - 1;
            while(start < end) {
                if(s.charAt(start) != s.charAt(end)) {
                    return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
                }
                start++;
                end--;
            }
            return true;
        }
        
        public boolean isPalindrome(String str, int i, int j) {
            while(i < j) {
                if(str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
}
// @lc code=end

