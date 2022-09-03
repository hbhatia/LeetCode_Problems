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
    //Using Second Approach given in Solution
    //Here we will use Two -Pass Approach
    //First we will just reach at n+1 with first pointer to maintin a gap of n places 
    // After that we will increment the first and second pointer untill first goes null.
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1,head);
        ListNode first=dummy;
        ListNode second=dummy;
        //First pointer will be traversed first to reach at nth Node from starting
        //and Initially First is at -1(before head) 
        //This way gap between first and second will be atleast n from starting
        for(int i=0;i<=n;i++){
            first=first.next;
        }
        
        //Now start traverse and increment both pointer till first reached the end
        while(null!=first){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;
    }
}