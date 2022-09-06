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
    //Using the brute force Approach 
    //We will store the results in to ArrayLoist and then check the Array List as Pallindrom or not by simply reversing it from start and end direction.
    public boolean isPalindrome(ListNode head) {
        List<Integer> lst=new ArrayList<Integer>();
        ListNode curr=head;
        while(curr!=null){
            lst.add(curr.val);
            curr=curr.next;
        }
        int size=lst.size();
        for(int i=0;i<=size/2;i++){
            if(lst.get(i)!=lst.get(size-i-1)){
                return false;
            }
        }
        return true;
    }
}