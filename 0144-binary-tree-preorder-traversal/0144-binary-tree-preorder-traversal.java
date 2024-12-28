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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
       preorder(root,result);
       return result;
    }
    private void preorder(TreeNode node,List<Integer> result){
        Stack<TreeNode> stack = new Stack<>();
        if(node!=null){
        stack.push(node);
        }
     while(!stack.isEmpty()){
        TreeNode fst_ele=stack.pop();
        result.add(fst_ele.val);
        if(fst_ele.right!=null){
            stack.push(fst_ele.right);
        }
        if(fst_ele.left!=null){
            stack.push(fst_ele.left);
        }
     }
    }
}