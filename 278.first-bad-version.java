/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 1; int hi = n;
        while(lo<hi){
            int med= lo+(hi-lo)/2;
            if(isBadVersion(med)){
                hi = med;
            }else{
                lo=med+1;
            }
        }
        return lo;
    }
}
// @lc code=end

