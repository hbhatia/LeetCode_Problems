/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //Using recursive Approach
    public ListNode reverseList(ListNode head) {
        if(null==head || null==head.next){
            return head;
        }
        ListNode lastNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return lastNode;
    }
}