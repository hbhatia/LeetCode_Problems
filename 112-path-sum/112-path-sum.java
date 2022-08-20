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
    //Doing With BFS Approach like in approach 2
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(null==root){
            return false;
        }
        LinkedList<TreeNode> stkN=new LinkedList<TreeNode>();
        LinkedList<Integer> stkV=new LinkedList<Integer>();
        stkN.push(root);
        stkV.push(targetSum-root.val);
        while(!stkN.isEmpty()){
            TreeNode node=stkN.pop();
            Integer val=stkV.pop();
            if(null==node.left && null==node.right && val==0){
                return true;
            }
            if(null!=node.right){
                stkN.push(node.right);
                stkV.push(val-node.right.val);
            }
            if(null!=node.left){
                stkN.push(node.left);
                stkV.push(val-node.left.val);
            }
        }
        return false;
        
    }
}