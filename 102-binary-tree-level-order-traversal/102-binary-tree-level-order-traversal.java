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
    //Using approach of recursion calls
    List<List<Integer>> retLst;
    public List<List<Integer>> levelOrder(TreeNode root) {
        retLst=new ArrayList<List<Integer>>();
        if(null==root){
            return retLst;
        }
        traverseTreeRecur(root,0);
        return retLst;
    }
    public void traverseTreeRecur(TreeNode root,int level){
        if(level==retLst.size()){
            retLst.add(new ArrayList<Integer>());
        }
        retLst.get(level).add(root.val);
        //Call left side of tree
        if(null!=root.left) traverseTreeRecur(root.left,level+1);
        //Call right side of tree
        if(null!=root.right) traverseTreeRecur(root.right,level+1);
    }
}