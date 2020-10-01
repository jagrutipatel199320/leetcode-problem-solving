/*
 * @lc app=leetcode id=1441 lang=java
 *
 * [1441] Build an Array With Stack Operations
 */

// @lc code=start
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<String>();
        int j =0;
        for(int i=1; i<=n && j<target.length; i++){
            result.add("Push");
            if(target[j] == i){
                j++;
            }else{
                result.add("Pop");
            }
        }
        return result;
    }
}
// @lc code=end

