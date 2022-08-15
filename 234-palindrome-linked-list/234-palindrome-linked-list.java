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
    //Using 3rd solution given by leetcode
    //Here we will first reverse the secodn half part of linkedlist
    //then we will compare each element of first half and second half of list one by one
    //We will then restore the reversed 2nd Half list to main list
    public boolean isPalindrome(ListNode head) {
        if(null==head) return true;
        ListNode firstHalfPtr=endOfFirstHalf(head);
        ListNode secondHalfPtr=reverseList(firstHalfPtr.next);
       // System.out.println(firstHalfPtr.val);
        ListNode p1=head;
        ListNode p2=secondHalfPtr;
        boolean result=true;
        while(result && null!=p2){
            if(p1.val!=p2.val) result=false;
            p1=p1.next;
            p2=p2.next;
        }
        firstHalfPtr.next=reverseList(secondHalfPtr);
        return result;
    }
    public ListNode endOfFirstHalf(ListNode start){
        ListNode slow=start;
        ListNode fast=start;
        while(null!=fast.next && null!=fast.next.next){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //reverse the list
    public ListNode reverseList(ListNode node){
        ListNode prev=null;
        ListNode curr=node;
        while(null!=curr){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}