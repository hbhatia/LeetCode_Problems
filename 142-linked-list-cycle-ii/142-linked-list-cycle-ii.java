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
    //Using floyed Detetction Algorithm to find the Commin Entrance point
    public ListNode detectCycle(ListNode head) {
        if(null==head || null==head.next){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        //This Entry node will come in use when we will need to traverse list again after finding cycle in the list at that time slow will be at some common node in the cycle.
        ListNode entry=head;
        while(null!=fast && null!=fast.next){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(slow!=entry){
                    slow=slow.next;
                    entry=entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}