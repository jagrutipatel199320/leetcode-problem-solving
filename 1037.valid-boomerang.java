/*
 * @lc app=leetcode id=1037 lang=java
 *
 * [1037] Valid Boomerang
 */

// @lc code=start
class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];

        double a = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double b = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
        double c = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));

        return !(a == b+c || b ==c+a || c ==b+a);
        
    }
}
// @lc code=end

