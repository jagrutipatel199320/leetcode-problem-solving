/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x == 0)
        return 0;
        
        double num = x;
        double temp;
        double sr = num/2;

        do {
            temp = sr;
            sr = (temp + num/temp)/2;

        }while((temp - sr) !=0 );

        return (int)sr;
    }
}
// @lc code=end

