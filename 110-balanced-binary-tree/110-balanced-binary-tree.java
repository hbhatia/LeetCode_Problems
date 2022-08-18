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
    //Using Approach 1 in Solution
    public boolean isBalanced(TreeNode root) {
        if(null==root){
            return true;
        }
        if(Math.abs(getHeight(root.left)-getHeight(root.right))>1){
            return false;
        }
        if(!isBalanced(root.left) || !isBalanced(root.right)){
            return false;
        }
        return true;
    }
    public int getHeight(TreeNode root){
        if(null==root){
            return -1;
        }
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
}