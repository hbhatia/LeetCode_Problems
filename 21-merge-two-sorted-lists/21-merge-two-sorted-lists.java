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
    //Using Recursive Approach
    //We will call recursively this method by passing both list pointers
    //So Recursive Call SmallElement(list1,list2)+Either[mergeTwoLists(list1.next,list2),mergeTwoList(list1,list2.next)]
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(null==list1){
            return list2;
        }
        if(null==list2){
            return list1;
        }
        else{
            if(list1.val<=list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
    }
}