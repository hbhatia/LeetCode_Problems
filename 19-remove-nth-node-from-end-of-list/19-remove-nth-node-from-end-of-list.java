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
    //Using the Approach 1 given in solution
    //First count the total length of list
    //Then reach at len-n from starting and delete len-n+1 node
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode start=head;
        while(null!=start){
            start=start.next;
            len++;
        }
        len-=n;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode p=dummy;
        while(len>0){
            p=p.next;
            len--;
        }
        p.next=p.next.next;
        return dummy.next;
    }
}