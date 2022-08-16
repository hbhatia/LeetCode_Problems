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
    //Using the Approach 2 in solution
    //Using Iterative Solution 
    //We will traverse in bfs manner
    public TreeNode invertTree(TreeNode root) {
        if(null==root){
            return root;
        }
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            TreeNode leftTemp=node.left;
            node.left=node.right;
            node.right=leftTemp;
            if(null!=node.left)q.add(node.left);
            if(null!=node.right)q.add(node.right);
        }
        return root;
    }
}