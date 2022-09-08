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
    //Using Iterative Approach using Stack
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> lst=new LinkedList<TreeNode> ();
        List<Integer> res=new ArrayList<Integer>();
        TreeNode curr=root;
        while(curr!=null || !lst.isEmpty()){
            while(curr!=null){
                lst.add(curr);
                curr=curr.left;
            }
            curr=lst.pollLast();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }
}