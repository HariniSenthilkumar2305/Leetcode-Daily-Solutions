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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }
   public int dfs(TreeNode node,int currentsum){
    if(node==null){
        return 0;
    }
    currentsum=2*currentsum+node.val;
    if(node.left==null && node.right==null){
        return currentsum;
    }
    int left=dfs(node.left,currentsum);
    int right=dfs(node.right,currentsum);
     return left+right;
   }
}