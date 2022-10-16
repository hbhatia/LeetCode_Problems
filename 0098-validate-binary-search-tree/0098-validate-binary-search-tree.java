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
    //Using Recursive Solution Approach in Solution
    //Here we use LinkedList also.
    LinkedList<TreeNode> stk=new LinkedList<TreeNode>();
    LinkedList<Integer> higherL=new LinkedList<Integer>();
    LinkedList<Integer> lowerL=new LinkedList<Integer>();
    public boolean isValidBST(TreeNode root) {
        if(null==root){
            return true;
        }
        stk.add(root);
        higherL.add(null);
        lowerL.add(null);
        while(!stk.isEmpty()){
            TreeNode node=stk.poll();
            Integer high=higherL.poll();
            Integer low=lowerL.poll();
            if(null==node) continue;
            if(null!=low && node.val<=low) return false;
            if(null!=high && node.val>=high) return false;
            //Insert Right Node
            update(node.right,node.val,high);
            //Insert Left Node
            update(node.left,low,node.val);
        }
        return true;
    }
    public void update(TreeNode node,Integer low,Integer high){
        stk.add(node);
        lowerL.add(low);
        higherL.add(high);
    }
}