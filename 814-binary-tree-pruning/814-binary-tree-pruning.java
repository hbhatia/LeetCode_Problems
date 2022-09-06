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
    //Using Given Solution in Solution section
    public TreeNode pruneTree(TreeNode root) {
        return isContainsOne(root)?root:null;
    }
    public boolean isContainsOne(TreeNode root){
        if(null==root){
            return false;
        }
        boolean left=isContainsOne(root.left);
        boolean right=isContainsOne(root.right);
        if(left==false) root.left=null;
        if(right==false) root.right=null;
        return root.val==1||left||right;
    }
}