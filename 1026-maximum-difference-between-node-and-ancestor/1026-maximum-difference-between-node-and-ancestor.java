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
    int res = 0;
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        res = 0;
        dfs(root, root.val, root.val);
        return res;
    }
    
    private void dfs(TreeNode root, int max, int min) {
        if (root == null) return;
        int res1 = Math.max(Math.abs(max - root.val), 
                            Math.abs(min - root.val));
        res = Math.max(res, res1);
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        dfs(root.left, max, min);
        dfs(root.right, max, min);
        return;
        
    }
}