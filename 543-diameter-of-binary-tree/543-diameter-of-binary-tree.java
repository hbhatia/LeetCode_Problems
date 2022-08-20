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
    //Using Approach 1 of DFS in the Solution
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        callTraverseTree(root);
        return diameter;
    }
    public int callTraverseTree(TreeNode root){
        if(null==root){
            return 0;
        }
        int leftH=callTraverseTree(root.left);
        int rightH=callTraverseTree(root.right);
        
        //Setting Diameter is our main thing as this variable contains maximum of itself and current sum of leftH and rightH.
        diameter=Math.max(diameter,leftH+rightH);
        //Here we will first take the max of left subtree and right subtree and then add 1 for current rrot node to get level
        return Math.max(leftH,rightH)+1;
    }
}