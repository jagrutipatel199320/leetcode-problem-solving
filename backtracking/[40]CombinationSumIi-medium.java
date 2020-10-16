import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Array.sort(candidates);
        backttrack(res,new ArrayList<>(),candidates,target,0);
    }

    public void backttrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int remains, int start ){
        if(remains<0) return ;
        else if(remains == 0) res.add(new ArrayList<>(temp));
        else{
            for(int i=start; i< nums.length;i++){
                if(i>start && nums[i] == nums[i-1]) continue;
                temp.add(nums[i]);
                backttrack(res, temp, nums,remains-nums[i], i+1);
                temp.remove(temp.size() -1);
            }
        }
    }
}
// @lc code=end

