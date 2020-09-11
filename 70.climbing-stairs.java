/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        
        if(n==1) return 1;
        if(n==2) return 2;

        int a[] = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        for(int i=3; i<=n; i++){
            a[i] = a[i-1]+a[i-2];
        }
    return a[n];
    }
}
// @lc code=end

