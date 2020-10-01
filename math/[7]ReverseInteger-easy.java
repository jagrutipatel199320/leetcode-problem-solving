/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
       long r = 0;
       boolean flag = false;
        if(x<0){
            flag = true;
            x = Math.abs(x);
        }

        while(x > 0){
            r = r*10 + x%10;
            if(r > Integer.MAX_VALUE) return 0;
            if(r < Integer.MIN_VALUE) return 0;
            x = x/10;
        }

        if(flag) r = -r;

        return (int)r;
    }
}
// @lc code=end

