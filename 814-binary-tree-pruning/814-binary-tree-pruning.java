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
    //Using DFS Solution to traverse the tree
    public TreeNode pruneTree(TreeNode root) {
        if(null==root){
            return root;
        }
        int rootval=callDFS(root);
        
        return rootval==0?null:root;
    }
    public int callDFS(TreeNode root){
        if(null==root){
            return 0;
        }
        else if(null==root.left && null==root.right){
            return root.val;
        }
        else{
            int left=callDFS(root.left);
            int right=callDFS(root.right);
            if(left==0){
                root.left=null;
            }
            if(right==0) root.right=null;
            return Math.max(root.val,Math.max(left,right));
        }
    }
}