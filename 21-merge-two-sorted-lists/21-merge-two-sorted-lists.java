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
    //Using Iterative Way to do this
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3=new ListNode(-1);
        ListNode p=list3;
        while(null!=list1 && null!=list2){
            if(list1.val<list2.val){
                list3.next=list1;
                list1=list1.next;
            }
            else{
                list3.next=list2;
                list2=list2.next;
            }
            list3=list3.next;
        }
        if(null!=list1){
            list3.next=list1;
        }
        else{
            list3.next=list2;
        }
        return p.next;
    }
}