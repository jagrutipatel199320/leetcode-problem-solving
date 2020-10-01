import java.util.List;

/*
 * @lc app=leetcode id=501 lang=java
 *
 * [501] Find Mode in Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Integer prev = null;
    int count  = 1;
    int max = 0;
    public int[] findMode(TreeNode root) {

        List<Integer> mods = new ArrayList<>();

        traverse(root,mods);

        int[] result = new int[mods.size()];
        for(int i=0;i<mods.size(); i++){
            result[i] = mods.get(i);
        }
        return result;
    }

    public void traverse(TreeNode root, List<Integer> mods){
        if (root == null) return;

        traverse(root.left, mods);

        if(prev !=  null){
            if(prev == root.val){
                count++;
            }else{
                count =1;
            }
        }
        
        if(count > max){
            mods.clear();
            mods.add(root.val);
            max = count;
        }else if(count == max){
            mods.add(root.val);
        }
        
        prev = root.val;
        traverse(root.right, mods);

    }
}
// @lc code=end

