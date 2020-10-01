import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        helper(root,queue,res);

        return res;
    }

    public void helper(Node cNode, Queue<Node> queue, List<List<Integer>> res){
        if(cNode == null) return;

        while(!queue.isEmpty()){
            int size = queue.size();

            List<Integer> temp = new ArrayList<>();

            for(int i =0; i< size; i++){
                Node curent = queue.remove();

                temp.add(curent.val);

                if(curent.children != null){
                    queue.addAll(curent.children);
                }
            }

            res.add(temp);
        }
    }
}
// @lc code=end

