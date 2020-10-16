import java.util.HashSet;

/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
        return null;

        HashSet<ListNode> map = new HashSet<>();

        ListNode a = headA;

        while(a != null){
            map.add(a);
            a = a.next;
        }

        ListNode b = headB;

        while(b != null){
            if(map.contains(b)){
                return b;
            }
            b=b.next;
        }

        return null;
    }
}
// @lc code=end

