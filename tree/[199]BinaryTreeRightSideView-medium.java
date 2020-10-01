import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import sun.invoke.empty.Empty;

/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if(root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //list.add(root.val);
        helper(root,list,queue);

        return list;
    }

    public void helper(TreeNode cur, List<Integer> list, Queue<TreeNode> queue)
    {
        if(cur == null) return;

        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0; i<size;i++){
                TreeNode current = queue.remove();
                if(i == size-1){
                    list.add(current.val);
                }

                if(current.left != null){
                    queue.add(current.left);
                }

                if(current.right !=null){
                    queue.add(current.right);
                }
            }
        }

    }
}
// @lc code=end

