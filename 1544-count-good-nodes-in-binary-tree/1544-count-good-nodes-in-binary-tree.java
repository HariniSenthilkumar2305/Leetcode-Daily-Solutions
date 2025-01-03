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
    int count=0;
    public int maxNodes(TreeNode root,int max){
        if(root==null){
            return 0;
        }
          if(root.val>=max){
            count++;
            max=root.val;
           maxNodes(root.left,max);
           maxNodes(root.right,max);
          }
          else{
            maxNodes(root.left,max);
            maxNodes(root.right,max);
          }
        return count;
    }
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return maxNodes(root,Integer.MIN_VALUE);
    }
}