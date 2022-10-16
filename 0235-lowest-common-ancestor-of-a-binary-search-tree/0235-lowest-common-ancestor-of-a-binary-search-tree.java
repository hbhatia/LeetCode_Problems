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
    //Using Approach 1 in the Solution
    //Recursive calls
    //here TC will be O(N) as tree might be right or left skewed and we may have to traverse it in complete nodes
    //Here SC is O(N) by same logic 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal=root.val;
        int pVal=p.val;
        int qVal=q.val;
        
        //Finding if Nodes exist in right sub tree
        if(pVal>parentVal && qVal>parentVal){
            return lowestCommonAncestor(root.right,p,q);
        }
        if(pVal<parentVal && qVal<parentVal){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }
}