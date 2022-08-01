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
    //Using Approach-1 given in solution
    //Recursion Traversal with Valid Range
    public boolean isValidBST(TreeNode root) {
        return validateBST(root,null,null);
    }
    public boolean validateBST(TreeNode root,Integer low,Integer high){
       if(null==root){
           return true;
       } 
       if((null!=low && root.val<=low) || (null!=high && root.val>=high))
           return false;
        return validateBST(root.left,low,root.val) && validateBST(root.right,root.val,high);
    }
    
}