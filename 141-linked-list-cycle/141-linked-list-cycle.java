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
    //Using Floyd Cycle Detetction Algorithm to know the cycle
    public boolean hasCycle(ListNode head) {
        if(null==head){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(slow!=fast){
            if(fast==null || null==fast.next){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}