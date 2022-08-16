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
    //Using BruteForce Approach to traverse tree recursively 
    //Swap Left and right node of each root one by one
    //This is coded in the form of Top-Down Approach and calling left and right node recursively.
    public TreeNode invertTree(TreeNode root) {
        if(null!=root){
            TreeNode left=root.left;
            TreeNode right=root.right;
            root.left=right;
            root.right=left;
            if(null!=root.left){
                invertTree(root.left);
            }
            if(null!=root.right){
                invertTree(root.right);
            }
        }
        return root;
    }
}