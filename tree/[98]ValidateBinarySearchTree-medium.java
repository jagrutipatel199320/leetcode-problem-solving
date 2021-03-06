import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
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
    public boolean isValidBST(TreeNode root) {
        
     Stack<TreeNode> stack = new Stack<>();
     TreeNode temp = null;

     while(root != null || !stack.isEmpty()){
         while(root!= null){
             stack.push(root);
             root = root.left;
         }

         root = stack.pop();

         if(temp != null && temp.val>= root.val) return false;

         temp= root;

         root =root.right;
     }

     return true;
    }
}
// @lc code=end

