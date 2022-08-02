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
    //Using Stack to traverse and check the tree 
    //Here Slack will contain value of node ,its high and its low capacity value.So Three Stack will be used.
    Stack<TreeNode> stk=new Stack<TreeNode>();
    Stack<Integer> lowLimit=new Stack<Integer>();
    Stack<Integer> highLimit=new Stack<Integer>();
    
    public boolean isValidBST(TreeNode root) {
        //Inserting the Root Node with null as both values
        stk.push(root);
        lowLimit.push(null);
        highLimit.push(null);
        while(!stk.isEmpty()){
            TreeNode node=stk.pop();
            Integer low=lowLimit.pop();
            Integer high=highLimit.pop();
            if(node==null) continue;
            int value=node.val;
            if(null!=low && value<=low) return false;
            if(null!=high && value>=high) return false; 
            //Insert Right Node just for pop after Left node
            stk.push(node.right);
            lowLimit.push(value);
            highLimit.push(high);
            
            //Now LeftNode
            stk.push(node.left);
            lowLimit.push(low);
            highLimit.push(value);
        }
        return true;
    }
}