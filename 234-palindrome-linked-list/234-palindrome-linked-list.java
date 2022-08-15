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
    //Using Approach 1 
    //We can copy the nodes value in the arraylist,string array.
    //But we can use only arraylist and string as we can add items in it idenfinitely without confirming the size beforehand
    //Then directly compare values of it using two pointer approach
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> lst=new ArrayList<Integer>();
        ListNode node=head;
        while(null!=node){
            lst.add(node.val);
            node=node.next;
        }
        int len=lst.size();
        for(int i=0;i<=len/2;i++){
            if(lst.get(i)!=lst.get(len-i-1)){
                return false;
            }
        }
        return true;
    }
}