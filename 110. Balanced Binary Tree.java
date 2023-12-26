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
    public boolean isbalanced = true;
    public boolean isBalanced(TreeNode root) {
        int a = maxHeight(root);
        return isbalanced;
    }

    public int maxHeight(TreeNode root){
        if(root==null) return 0;
        int l = maxHeight(root.left);
        int r = maxHeight(root.right);
        if(Math.abs(l-r)>1) {
            isbalanced = false;
            return 0;
        };
        return 1+Math.max(l,r);
    }
}
