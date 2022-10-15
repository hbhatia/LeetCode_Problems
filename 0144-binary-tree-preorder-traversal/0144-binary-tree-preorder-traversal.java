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
    //Using Iterative Approach
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output=new ArrayList<Integer>();
        LinkedList<TreeNode> stk=new LinkedList<TreeNode>();
        if(null==root){
            return output;
        }
        stk.push(root);
        while(!stk.isEmpty()){
            TreeNode node=stk.poll();
            output.add(node.val);
            if(null!=node.right){
                stk.push(node.right);
            }
            if(null!=node.left){
                stk.push(node.left);
            }
        }
        return output;
    }
}