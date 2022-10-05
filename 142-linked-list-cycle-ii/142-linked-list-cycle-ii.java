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
        Set<ListNode> map=new HashSet<ListNode>();
        while(null!=head){
            if(!map.add(head)){
                return head;
            }
            head=head.next;
        }
        return null;
    }
}