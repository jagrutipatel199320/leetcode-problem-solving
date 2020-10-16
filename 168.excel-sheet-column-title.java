/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        StringBuilder result =  new StringBuilder();

        while(n>0){
            n--;
            result.insert(0,(char)('A' + n%26));
            n /=26;
        }

        return result.toString();
    }
}
// @lc code=end

