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
    //Using the Solution apporach given in Solution
    //Using Inorder recursive way
    public Integer prev=null;
    public boolean isValidBST(TreeNode root) {
        if(null==root){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(null!=prev && root.val<=prev){
            return false;
        }
        prev=root.val;
        return isValidBST(root.right);
    }
}