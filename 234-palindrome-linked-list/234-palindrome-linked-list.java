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
    //Using the 2nd Solution given in
    //We will use here Recursion approach
    ListNode first;
    public boolean isPalindrome(ListNode head) {
        first=head;
        return recursiveTraverse(head);
    }
    
    public boolean recursiveTraverse(ListNode head){
        if(null!=head){
            if(!recursiveTraverse(head.next)) return false;
            if(first.val!=head.val) return false;
            first=first.next;
        }
        return true;
    }
}