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
    //Using Iterative Approach given in Solution
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal=p.val;
        int qVal=q.val;
        TreeNode node=root;
        while(null!=node){
            int parentVal=node.val;
            if(pVal>parentVal && qVal>parentVal){
                node=node.right;
            }
            else if(pVal<parentVal && qVal<parentVal){
                node=node.left;
            }
            else{
                return node;
            }
        }
        return null;
        
    }
}