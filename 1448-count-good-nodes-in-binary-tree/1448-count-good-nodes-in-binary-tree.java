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
    //Using The Simple DFS Traversal
    int count=0;
    public int goodNodes(TreeNode root) {
        if(null==root) return count;
        callDFSTree(root,Integer.MIN_VALUE);
        return count;
    }
    public void callDFSTree(TreeNode root,int prevVal){
        if(root==null){
            return ;
        }
        if(root.val>=prevVal){
            count++;
            prevVal=root.val;
        }
        callDFSTree(root.left,prevVal);
        callDFSTree(root.right,prevVal);
    }
}