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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode>q=new ArrayDeque<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int ans1=0;
        q.add(root);
        while(q.size()>0){
            int n=q.size();
            ArrayList<Integer>a=new ArrayList<>();
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
          ans.add(a.get(0));
        }
        ans1=ans.get(ans.size()-1);
        return ans1;
    }
}