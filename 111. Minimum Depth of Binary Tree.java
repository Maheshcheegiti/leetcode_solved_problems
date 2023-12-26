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
    public int minDepth(TreeNode root) {
        return minHeight(root);
    }

    public int minHeight(TreeNode root){
        if(root==null) return 0;
        int l = minHeight(root.left);
        int r = minHeight(root.right);
        System.out.println(l+" "+r);
        if(l==0 || r==0) return l+r+1;
        return 1+Math.min(l,r);
    }
}
