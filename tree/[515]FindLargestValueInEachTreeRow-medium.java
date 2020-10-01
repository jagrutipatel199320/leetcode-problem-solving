import java.util.List;
import java.util.Queue;

import javax.management.Query;
import javax.swing.tree.TreeNode;

import jdk.internal.jline.console.CursorBuffer;

/*
 * @lc app=leetcode id=515 lang=java
 *
 * [515] Find Largest Value in Each Tree Row
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();


        if(root == null) return result;
        
        queue.add(root);

        //result.add(root.val);
        helper(root,result,queue);
        return result;
    }

    public void helper(TreeNode cur, List<Integer> res, Queue<TreeNode> queue)
    {
        if(cur == null) return;
        while(!queue.isEmpty())
        {
           int size = queue.size();
           List<Integer> temp = new ArrayList<>();
           
           for(int i=0; i< size; i++){
            TreeNode current = queue.remove();
            temp.add(current.val);

            if(current.left != null){
                queue.add(current.left);
            }

            if(current.right != null){
                queue.add(current.right);
            }
           }

           int max = Integer.MIN_VALUE;
           for(int i=0; i< temp.size(); i++){
               if(temp.get(i)> max){
                   max = temp.get(i);
               }
           }
           res.add(max);

        }

        
    }
}
// @lc code=end

