import javax.swing.tree.TreeNode;

import jdk.nashorn.api.tree.Tree;

/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        return (root == null || check(root.left, root.right));
        

    }
    public boolean check(TreeNode leftSub, TreeNode rightSub){
        if(leftSub == null && rightSub == null)
        return true;
        if(leftSub == null || rightSub == null)
        return false;
        if(leftSub.val != rightSub.val)
        return false;

        return check(leftSub.left, rightSub.right) && check(leftSub.right, rightSub.left);
    }
}
// @lc code=end

