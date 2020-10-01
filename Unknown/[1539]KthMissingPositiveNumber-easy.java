/*
 * @lc app=leetcode id=1539 lang=java
 *
 * [1539] Kth Missing Positive Number
 */

// @lc code=start
class Solution {
    public int findKthPositive(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap();
        Set<Integer> set = new HashSet();

        int max = arr[arr.length - 1];

        for(int n : arr){
            set.add(n);
        }
        int j = 1;
        for(int i = 1; i<=max+k; i++){
            if(!set.contains(i)){
                map.put(j++,i);
            }
        }
        return map.get(k);
    }
}
// @lc code=end

