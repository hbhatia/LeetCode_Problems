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
    //Doing by first Approach given in solution
    //Here we will first count the length
    //Beacuse from starting We need to remove L-N+1 element
    //So while traverisng (IN 2nd Iteration) we will traverse till N-L element.
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int countNodes=0;
        ListNode root=head;
        while(null!=root){
            countNodes++;
            root=root.next;
        }
        ListNode dummy=new ListNode(-1,head);
        ListNode curr=dummy;
        int reachStart=0;
        while(reachStart<countNodes-n){
            dummy=dummy.next;
            reachStart++;
        }
        dummy.next=dummy.next.next;
        return curr.next;
    }
}