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
    //Using BFS Approach
    //To traverse a tree Level by levele and insert nodes at each level to ArrayList.
    List<List<Integer>> output;
    LinkedList<TreeNode> queue;
    public List<List<Integer>> levelOrder(TreeNode root) {
        output=new ArrayList<List<Integer>>();
        queue=new LinkedList<TreeNode>();
        if(null==root){
            return output;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            List<Integer> lst=new ArrayList<Integer>();
            for(int i=0;i<len;i++){
                TreeNode node=queue.poll();
                lst.add(node.val);
                if(null!=node.left){
                    queue.add(node.left);
                }
                if(null!=node.right){
                    queue.add(node.right);
                }
            }
            output.add(new ArrayList<Integer>(lst));
        }
       return output;  
    }
}