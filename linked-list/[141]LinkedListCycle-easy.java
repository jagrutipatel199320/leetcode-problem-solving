/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
        return false;
        
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null){

            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }else{
                return false;
            }
            if(slow == fast){
                return true;
            }
           
        }

        return false;
    }
}
// @lc code=end

