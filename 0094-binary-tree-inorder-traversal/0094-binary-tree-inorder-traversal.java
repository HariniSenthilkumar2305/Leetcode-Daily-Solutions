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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer>result=new ArrayList<>();
       inorder(root,result);
       return result;
    }
public void inorder(TreeNode node,List<Integer> result){
  Stack<TreeNode>st=new Stack<>();
  TreeNode current=node;
  while(current!=null || !st.isEmpty()){
    while(current!=null){
        st.push(current);
        current=current.left;
    }
    current=st.pop();
    result.add(current.val);
    //traverse through right
    current=current.right;
  }
}
}