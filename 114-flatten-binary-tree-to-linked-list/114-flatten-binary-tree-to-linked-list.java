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
    public void flatten(TreeNode root) {
        flatten2(root);
    }
    
    private TreeNode flatten2(TreeNode root) {
        if ((root == null) || (root.left == null && root.right == null) ) {
            return root;
        }
        
        TreeNode L = this.flatten2(root.left);
        TreeNode R = this.flatten2(root.right);
        
        if (L != null) {
            L.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        return (R == null ? L : R);
    }
   
}