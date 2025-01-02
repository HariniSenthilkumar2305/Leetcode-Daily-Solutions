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
    public void binaryTree(TreeNode root,List<String> a,String val){
         if(root==null){
            return;
        }
        else if(root.left==null && root.right==null){
           val=val+root.val;
            a.add(val);
            return ;
        }
        binaryTree(root.left,a,val+root.val+"->");
        binaryTree(root.right,a,val+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>a=new ArrayList<>();
        if(root!=null){
         binaryTree(root,a,"");
        }
        return a;
    }
}