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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first=new ListNode(-1);
        ListNode second= new ListNode(-1);
        ListNode op=second;
        first.next=head;
        second.next=head;
        int step=n;
        //Taking first pointer to 
        while(step>0){
            first=first.next;
            step--;
        }
        while(null!=first && null!=first.next){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return op.next;
    }
}