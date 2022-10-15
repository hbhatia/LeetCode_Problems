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
    //Using Recursive Solution 
    //Link -https://leetcode.com/problems/n-ary-tree-preorder-traversal/discuss/147955/Java-Iterative-and-Recursive-Solutions
    List<Integer> output=new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        if(null==root){
            return output;
        }
        else{
            output.add(root.val);
            for(int i=0;i<root.children.size();i++){
                preorder(root.children.get(i));
            }
            return output;
        }
    }
}