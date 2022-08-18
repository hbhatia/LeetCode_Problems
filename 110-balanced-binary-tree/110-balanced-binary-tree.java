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
    //Using Approach 2 in Given Solution
    //Here we will make new custom class to store result of very node
    //This class will have isBalanced and Height as fields
    //Here we will traverse in bottom-Up Mannner
    //In Top Down approach many calls were duplicate.
    public boolean isBalanced(TreeNode root) {
        return isTreeNodeBalanced(root).isBalanced;
    }
    public TreeInfo isTreeNodeBalanced(TreeNode root){
        if(root==null){
            return new TreeInfo(true,-1);
        }
        TreeInfo leftN=isTreeNodeBalanced(root.left);
        if(!leftN.isBalanced){
            return new TreeInfo(false,-1);
        }
        TreeInfo rightN=isTreeNodeBalanced(root.right);
        if(!rightN.isBalanced){
            return new TreeInfo(false,-1);
        }
        if(Math.abs(leftN.height-rightN.height)>1){
            return new TreeInfo(false,-1);
        }
        return new TreeInfo(true,Math.max(leftN.height,rightN.height)+1);
    } 
}

class TreeInfo{
    boolean isBalanced;
    int height;
    TreeInfo(boolean bal,int h){
        this.isBalanced=bal;
        this.height=h;
    }
}