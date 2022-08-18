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
    public boolean isValid;
    public boolean isBalanced(TreeNode root) {
        if(null==root){
            return true;
        }
        isValid=true;
        int leftH=getHeight(root.left);
        int rightH=getHeight(root.right);
        if(!isValid) return false;
        return (Math.abs(leftH-rightH)<=1);
    }
    public int getHeight(TreeNode root){
        if(null==root || !isValid){
            return -1;
        }
        else{
            int leftH=getHeight(root.left);
            int rightH=getHeight(root.right);
            if(Math.abs(leftH-rightH)>1) {
                this.isValid=false;
                return Integer.MAX_VALUE;
            }
            int h=1+Math.max(leftH,rightH);
            return h;
        }
    }
}