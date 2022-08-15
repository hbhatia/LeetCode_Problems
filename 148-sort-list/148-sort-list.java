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
    //Using Solution Provide by Leetcode 
    //Solution 1
    public ListNode sortList(ListNode head) {
        if(null==head|| null==head.next) return head;
        ListNode mid=getMidNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return mergeList(left,right);
    }
    public ListNode getMidNode(ListNode head){
        ListNode slow=head,fast=head;
        ListNode temp=null;
        while(null!=fast && null!=fast.next){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        return slow;
    }
    public ListNode mergeList(ListNode left,ListNode right){
        ListNode newNode=new ListNode(-1);
        ListNode ptr=newNode;
        while(null!=left && null!=right){
            if(left.val<=right.val){
                ptr.next=left;
                left=left.next;
            }
            else{
                ptr.next=right;
                right=right.next;
            }
            ptr=ptr.next;
        }
        ptr.next=(left==null)?right:left;
        return newNode.next;
    }
}