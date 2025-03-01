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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>q=new ArrayDeque<>();
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        while(q.size()>0){
            ArrayList<Integer>a=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q.remove();
                a.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            ans.add(a.get(a.size()-1));
        }
       return ans; 
    }
}