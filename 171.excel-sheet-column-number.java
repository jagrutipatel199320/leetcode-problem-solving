/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        if(s.length() == 0)
        return 0;

        int temp = s.charAt(0) - 'A'+ 1;

        for(int i =1; i <s.length(); i++){
            temp = (temp*26) + s.charAt(i) - 'A' +1;
        }
        return temp;
    }
}
// @lc code=end

