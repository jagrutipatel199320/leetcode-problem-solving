import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/*
 * @lc app=leetcode id=987 lang=java
 *
 * [987] Vertical Order Traversal of a Binary Tree
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

    Map<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root == null) return null;

        map = new TreeMap<>();

        dfs(root,0,0);
        List<List<Integer>> res = new ArrayList<>();
        for (int key: map.keySet()){
            List<Integer> list = new ArrayList<>();
            TreeMap<Integer,PriorityQueue<Integer>> tm = map.get(key);
            for (int k: tm.keySet()){
                PriorityQueue<Integer> pq = tm.get(k);

                while(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }
            res.add(list);
        }

        return res;
    }

    private void dfs(TreeNode root, int index, int level){
        if (root == null)
            return;
        
        map.putIfAbsent(index, new TreeMap<>());
        map.get(index).putIfAbsent(level, new PriorityQueue<>());
        map.get(index).get(level).add(root.val);
        dfs(root.left, index - 1, level + 1);
        dfs(root.right, index + 1, level + 1);
    }
}
// @lc code=end

