/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder result = new StringBuilder();

        if(strs.length ==0)
            return "";

        Arrays.sort(strs);

        char[] a = strs[0].toCharArray();
        char[] b = strs[strs.length -1].toCharArray();

        for(int i =0; i<a.length;i++){
            if(b.length > i && a[i] == b[i])
            result.append(b[i]);
            else
            return result.toString();
        }

        return result.toString();
    }
}
// @lc code=end

