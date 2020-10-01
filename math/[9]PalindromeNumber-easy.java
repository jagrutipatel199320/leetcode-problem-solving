/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
       
        if(x < 0)
            return false;

        if(x/10 == 0)
            return true;

        long r = 0;
        int c = x;
        while(x>0){
            r = r*10 + x%10;
            x = x/10;
        }
        //System.out.println(r);
        if(c==r)
        return true;
        else
        return false;
    }
}
// @lc code=end

