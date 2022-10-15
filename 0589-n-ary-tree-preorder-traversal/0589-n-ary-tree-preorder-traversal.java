/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    //Iterative Solution using Discussion and Solution
    public List<Integer> preorder(Node root) {
        List<Integer> output=new ArrayList<Integer>();
        if(null==root){
            return output;
        }
        LinkedList<Node> stk=new LinkedList<Node>();
        stk.push(root);
        while(!stk.isEmpty()){
            Node node=stk.poll();
            output.add(node.val);
            for(int i=node.children.size()-1;i>=0;i--){
                stk.push(node.children.get(i));
            }
        }
        return output;
    }
}