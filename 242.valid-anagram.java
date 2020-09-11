import java.util.Arrays;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        
        char charS[] = s.toCharArray();
        char charT[] = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        String sorder = new String(charS);
        String torder = new String(charT);

        if(sorder.equals(torder))
        return true;
        else
        return false;
    }
}
// @lc code=end

