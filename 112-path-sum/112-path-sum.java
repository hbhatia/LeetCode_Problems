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
    
    //Using BruteForce Apporach of recursion calls
    //Doing with the help of global variable to update value whenever results is found or else as default is False.
    boolean hasFound=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(null==root){
            return hasFound;
        }
        else if(null==root.left && null==root.right){
            if(targetSum==root.val){
                hasFound=true; 
            }
        }
        else{
            hasPathSum(root.left,targetSum-root.val);
            hasPathSum(root.right,targetSum-root.val);
        }
        return hasFound;
    }
}