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
    public boolean isValidBST(TreeNode root) {
        return isBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean isBST(TreeNode root, long min, long max){
        if(root == null) return true;
        if(root.val>min && root.val<=max){
            boolean ans1 = isBST(root.left,min,root.val-1);
            boolean ans2 = isBST(root.right,root.val,max);
            return ans1&&ans2;
        }
        return false;
    }
}
