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
    //Using Reecursion Traversal to sen =d high and low value for a node 
    //and check that this value is valid
    //For Left node call set high value as root.val
    //For Right node call set low value as root.val
    public boolean isValidBST(TreeNode root) {
        return validateBST(root,null,null);
    }
    public boolean validateBST(TreeNode root,Integer low,Integer high){
        if(root==null){
            return true;
        }
        if((null!=high && root.val>=high)||(null!=low && root.val<=low)){
            return false;
        }
        return validateBST(root.left,low,root.val) && validateBST(root.right,root.val,high);
    }
}