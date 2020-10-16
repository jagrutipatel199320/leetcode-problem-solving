import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int sum =0;

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
        

            if(node.left != null && node.left.left ==null && node.left.right == null){
                sum += node.left.val;
            }

            if(node.left != null){
                stack.push(node.left);
            }

            if(node.right != null){
                stack.push(node.right);
            }
        }
        return sum;
    }
}
// @lc code=end

