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
        ListNode node=head;
        while(null!=node){
            len++;
            node=node.next;
        }
        if(n>len) return head;
        int pos=0;
        ListNode dummy=new ListNode(-1);
        ListNode first=dummy;
        dummy.next=head;
        while(pos<len-n){
            dummy=dummy.next;
            pos++;
        }
        dummy.next=dummy.next.next;
        return first.next;
    }
}