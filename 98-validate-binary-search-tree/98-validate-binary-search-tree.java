/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    //Using the solution given using Inorder Traversal 
    //Using Iterative Traversal Approach
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stk=new Stack<TreeNode>();
        Integer prev=null;
        while(!stk.isEmpty() || null!=root){
            while(null!=root){
                stk.push(root);
                root=root.left;
            }
            root=stk.pop();
            //Take out recent Last Added Node from Stack
            if(null!=prev && root.val<=prev) return false;
            prev=root.val;
            root=root.right;
        }
        return true;
    }
}