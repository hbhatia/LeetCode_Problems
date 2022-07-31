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
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> q=new LinkedList<TreeNode>();
        List<List<Integer>> values=new ArrayList<List<Integer>>();
        q.add(root);
        if(null==root) return values;
        while(!q.isEmpty()){
            List<Integer> lst=new ArrayList<Integer>();
            int nodeCount=q.size();
            for(int i=0;i<nodeCount;i++){
                TreeNode node=q.pollFirst();
                lst.add(node.val);
                if(null!=node.left){
                    q.add(node.left);
                }
                if(null!=node.right){
                    q.add(node.right);
                }
            }
            values.add(lst);
        }
        return values;
    }
}