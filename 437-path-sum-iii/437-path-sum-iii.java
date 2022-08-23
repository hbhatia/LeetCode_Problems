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
    //Using the Approach of Prefix Given in Solution
    int k;
    int count;
    HashMap<Long,Integer> map;
    public void preorder(TreeNode root,long sum){
        if(root==null) return ;
        sum+=root.val;
        if(sum==k){
            count++;
        }
        count+=map.getOrDefault(sum-k,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
        preorder(root.left,sum);
        preorder(root.right,sum);
        map.put(sum,map.get(sum)-1);
    }
    public int pathSum(TreeNode root, int targetSum) {
        map=new HashMap<Long,Integer>();
        k=targetSum;
        count=0;
        preorder(root,0);
        return count;
    }
}