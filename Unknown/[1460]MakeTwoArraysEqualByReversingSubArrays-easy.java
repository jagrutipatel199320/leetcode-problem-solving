/*
 * @lc app=leetcode id=1460 lang=java
 *
 * [1460] Make Two Arrays Equal by Reversing Sub-arrays
 */

// @lc code=start
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length)
        return false;

        Arrays.sort(target);
        Arrays.sort(arr);

        if(Arrays.equals(target,arr))
        return true;

        return false;
    }
}
// @lc code=end

