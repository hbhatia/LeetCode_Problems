//Using HashSet to store already visited Noded
public boolean hasCycle(ListNode head) {
HashSet<Integer> set=new HashSet<Integer>();
while(null!=head){
if(!set.add(head.val)){
return true;
}
head=head.next;
}
return false;
}
**This HasshSet based approach won't work here as Node value can come more than two times in different Nodes.
**