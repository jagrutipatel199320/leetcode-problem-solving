import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Zigzag Level Order Traversal
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        helper(root,res,queue);

        return res;
    }

    public void helper(TreeNode cur, List<List<Integer>> res, Queue<TreeNode> queue){
        if(cur == null) return;

        int c = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            List<Integer> temp = new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode node = queue.remove();
                if(c%2 == 0){
                    temp.add(node.val);
                }else{
                    temp.add(0,node.val);
                }

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
            }
            c++;
            res.add(temp);
        }
    }
}
// @lc code=end

