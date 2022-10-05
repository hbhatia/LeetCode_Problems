/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    //Using HashMap based bruteforce Approach
    //TC- O(N)
    //SC- O(N)
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> map=new HashMap<ListNode,Integer>();
        int pos=0;
        while(null!=head){
            if(!map.containsKey(head)){
                map.put(head,pos);
                pos++;
            }
            else{
                return head;
            }
            head=head.next;
        }
        return null;
    }
}