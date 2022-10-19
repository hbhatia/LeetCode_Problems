/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    //Using Second Approach of Solution
    //Here we will use Iteration Technique and Parent pointers to keep track of Parent pointer
    //Same thing in recursion was being done with the help of Backtracking
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        HashMap<TreeNode,TreeNode> map=new HashMap<TreeNode,TreeNode>();
        LinkedList<TreeNode> stk=new LinkedList<TreeNode>();
        
        stk.add(root);
        map.put(root,null);
        
        while(!map.containsKey(p)||!map.containsKey(q)){
            TreeNode node=stk.poll();
            if(node.left!=null){
                stk.add(node.left);
                map.put(node.left,node);
            }
            if(node.right!=null){
                stk.add(node.right);
                map.put(node.right,node);
            }
        }
        //Till now both nodes has been found.
        //Searching for Node P
        HashSet<TreeNode> set=new HashSet<TreeNode>();
        while(null!=p){
            set.add(p);
            p=map.get(p);
        }
        while(!set.contains(q)){
            q=map.get(q);
        }
        return q;
    }
}