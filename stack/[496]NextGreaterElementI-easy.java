/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
		// Store the index of every element of 2nd array since every element is unique
		for (int i = 0; i < nums2.length; i++) map.put(nums2[i],i);
		for (int i = 0; i < nums1.length; i++) {
		// search from this index in 2nd array 
			int ind = map.get(nums1[i]);
			int fill = -1;
			for (int j = ind+1; j < nums2.length; j++) 
				if (nums2[j] > nums1[i]) {
					fill = nums2[j];
					break;
				}
			nums1[i] = fill; // update nums1
		}
		return nums1;
    }
}
// @lc code=end

