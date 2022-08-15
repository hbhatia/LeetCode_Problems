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
    //Using the Approach 2 given in solution
    //We will use two pointers one is first and another is second
    //Before Traversal start First will jump to n+1 steps
    //After that we will increment first and second one by one
    //Using One pass
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode first=dummy;
        ListNode second=dummy;
        int i=1;
        while(i++<=n+1){
            first=first.next;
        }
        while(null!=first){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;
    }
}