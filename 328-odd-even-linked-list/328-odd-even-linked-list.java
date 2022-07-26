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
    //This is little bit tweak 
    //This is here - 
    //https://leetcode.com/problems/odd-even-linked-list/discuss/78079/Simple-O(N)-time-O(1)-space-Java-solution.
    public ListNode oddEvenList(ListNode head) {
        if(null==head) return head;
        ListNode odd=head;
        ListNode even=odd.next;
        ListNode evenHead=even;
        while(null!=even && null!=even.next){
           odd.next=odd.next.next;
           even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}