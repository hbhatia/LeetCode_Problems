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
    //Using simple Iterative Approach
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l3=new ListNode(-1,null);
        ListNode ptr=l3;
        while(null!=list1 && null!=list2){
            if(list1.val<=list2.val){
                l3.next=list1;
                list1=list1.next;
                l3=l3.next;
            }
            else{
                l3.next=list2;
                list2=list2.next;
                l3=l3.next;
            }
        }
        l3.next=(list1==null?list2:list1);
        return ptr.next;
    }
}