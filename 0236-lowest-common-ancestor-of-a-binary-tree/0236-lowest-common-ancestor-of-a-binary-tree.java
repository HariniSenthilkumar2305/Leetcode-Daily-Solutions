/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathToP = new ArrayList<>();
        List<TreeNode> pathToQ = new ArrayList<>();

        if (!findPath(root, p, pathToP) || !findPath(root, q, pathToQ)) {
            return null; 
        }

        int i = 0;
        while (i < pathToP.size() && i < pathToQ.size() && pathToP.get(i) == pathToQ.get(i)) {
            i++;
        }

        return pathToP.get(i - 1);
    }

    private boolean findPath(TreeNode root, TreeNode target, List<TreeNode> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root == target) {
            return true;
        }

        boolean left=findPath(root.left, target, path) ;
        boolean right =findPath(root.right, target, path);

        if(left||right)
        {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }
}