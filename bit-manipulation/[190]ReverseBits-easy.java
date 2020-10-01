/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.toString(n);

        StringBuilder in = new StringBuilder();

        in.append(str);

        in = in.reverse();

        return Integer.parseInt(in);

    }
}
// @lc code=end

