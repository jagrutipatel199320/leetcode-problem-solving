/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode inter(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return slow;
            }
        }

        return null;
    }

    public ListNode detectCycle(ListNode head) {
       if(head == null || head.next == null)
       return null;

       ListNode inter = inter(head);
        if(inter == null)
        return null;

        ListNode start = head;

        while(inter != start){
            start = start.next;
            inter = inter.next;
        }

        return start;
    }
}
// @lc code=end

