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
    //Using Approch 3 in Solution
    //InOrder traversal in DF style Using Recursion
    Integer prev=null;
    public boolean isValidBST(TreeNode root) {
        if(null==root) return true;
        return inorder(root);
    }
    public boolean inorder(TreeNode root){
        if(null==root){
            return true;
        }
        if(!inorder(root.left)){
            return false;
        }
        if(null!=prev && root.val<=prev) return false;
        prev=root.val;
        return inorder(root.right);
    }
}