import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.management.Query;

/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(root == null)
        return result;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(q.size() > 0){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i =0; i< size; i++){
                TreeNode temp = q.poll();
                list.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            result.add(0,list);
        }
        return result;
    }
}
// @lc code=end

