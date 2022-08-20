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
    //Doing With recursion by Approach 1 in solution
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(null==root){
            return false;
        }
        targetSum-=root.val;
        if(null==root.left && null== root.right) {
            if(targetSum==0) return true;
        }
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}