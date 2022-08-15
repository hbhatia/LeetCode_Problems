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
    //Using solution 1 given by Leetcode
    public ListNode oddEvenList(ListNode head) {
        if(null==head) return head;
        ListNode odd=head;
        ListNode even=odd.next;
        ListNode evenHead=even;
        while(null!=even && null!=even.next){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}