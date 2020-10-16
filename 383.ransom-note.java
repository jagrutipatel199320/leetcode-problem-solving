/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] res = new int[26];
        for(int i=0; i<magazine.length(); i++ ){
            res[magazine.charAt(i) - 'a'] ++;
        }

        for (int i =0; i<ransomNote.length(); i++){
            if(--res[ransomNote.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
    }
}
// @lc code=end

