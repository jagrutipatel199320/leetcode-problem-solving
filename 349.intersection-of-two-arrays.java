import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> Inter = new HashSet<>();

        for(int i =0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i =0; i< nums2.length; i++){
            if(set.contains(nums2[i]))
            Inter.add(nums2[i]);
        }

        int[] result = new int[Inter.size()];
        int i = 0;
        for(int a : Inter)
        result[i++] = a;

        return result;
    }
}
// @lc code=end

