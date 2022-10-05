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
    //Using the Recursive Approach
    ListNode lstNode=null;
    public ListNode reverseList(ListNode head) {
        lstNode=null;
        callTraverseList(head);
        return lstNode;
    }
    public ListNode callTraverseList(ListNode head){
        if(null==head || null==head.next){
            lstNode=head;
            return head;
            
        }
        ListNode nextNode=callTraverseList(head.next);
        nextNode.next=head;
        head.next=null;
        return head;
            
    }
}