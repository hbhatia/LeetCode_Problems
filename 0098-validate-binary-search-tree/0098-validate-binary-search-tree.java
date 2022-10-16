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
    //Using Recursive Approach in Solution
    public boolean isValidBST(TreeNode root) {
        //call recursive Method to check the node
        return isValidateBST(root,null,null);
    }
    public boolean isValidateBST(TreeNode root,Integer low,Integer high){
        if(null==root){
            return true;
        }
        if((null!=low && root.val<=low) || (null!=high && root.val>=high)){
            return false;
        }
        return isValidateBST(root.left,low,root.val) && isValidateBST(root.right,root.val,high);
    }
}