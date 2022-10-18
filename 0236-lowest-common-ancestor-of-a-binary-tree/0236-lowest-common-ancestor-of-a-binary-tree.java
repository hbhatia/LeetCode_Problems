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
    //Using First Approach in given Solution
    
    TreeNode lca=null;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)  {
        findCommonNode(root,p,q);
        return this.lca;
    }
    public boolean findCommonNode(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return false;
        }
        int left=findCommonNode(root.left,p,q)?1:0;
        int right=findCommonNode(root.right,p,q)?1:0;
        int mid=(root==p || root==q)?1:0;
        
        if(left+right+mid>=2){
            this.lca=root;
        }
        return (left+right+mid)>=1?true:false;
    
    }
}