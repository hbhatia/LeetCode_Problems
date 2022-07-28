/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    //Using Approach given in solution --Recursive Solution
    TreeNode node;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findCommmonNode(root,p,q);
        return node;
    }
    public boolean findCommmonNode(TreeNode root,TreeNode p,TreeNode q){
        if(null==root){
            return false;
        }
        int leftNode=findCommmonNode(root.left,p,q)?1:0;
        int rightNode=findCommmonNode(root.right,p,q)?1:0;
        int mid= (p==root || q==root)?1:0;
        if(mid+leftNode+rightNode>=2){
            this.node=root;
        }
        return (leftNode+rightNode+mid>0);
    }
}