import java.awt.List;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=872 lang=java
 *
 * [872] Leaf-Similar Trees
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 != null) return false;
        if(root1 != null && root2 == null) return false;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root1);
        stack2.push(root2);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        dfs(root1,stack1,list1);
        dfs(root2,stack2,list2);

        System.out.println(list1);
        System.out.println(list2);

        if(list1.size() != list2.size()){
            return false;
        }else{
            for(int i =0, j=0; i < list1.size(); i++, j++){
                if(list1.get(i) != list2.get(j)){
                    return false;
                }
            }
        }

        return true;
        
        
    }

    public void dfs(TreeNode root, Stack<TreeNode> stack, List<Integer> list){
        if(root == null) return;

        while(!stack.isEmpty()){
            TreeNode current = stack.pop();

            if(current.left == null && current.right == null){
                list.add(current.val);
            }

            if(current.left != null){
               stack.push(current.left);
            }

            if(current.right != null){
                stack.push(current.right);
            }
        }

    }
}
// @lc code=end

