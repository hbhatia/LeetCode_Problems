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
    List<List<Integer>> op;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        op=new ArrayList<List<Integer>>();
        if(null==root){
            return op;
        }
        List<Integer> currList=new ArrayList<Integer>();
        //currList.add(root.val);
        callTraverseTree(root,currList,targetSum);
        return op;
    }
    public void callTraverseTree(TreeNode root,List<Integer> ls,int sum){ 
        if(null==root){
            return ;
        }
        sum-=root.val;
        ls.add(root.val);
        if(null==root.left && null==root.right){
             if(sum==0){
                 op.add(new ArrayList<Integer>(ls));
                 //return;
             }
        }
        else{
            callTraverseTree(root.left,ls,sum);
            callTraverseTree(root.right,ls,sum);
        }
        ls.remove(ls.size()-1);
    }
}