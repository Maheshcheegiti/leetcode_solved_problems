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
    public int maxAncestorDiff(TreeNode root) {
        return helper(root, root.val, root.val);
    }

  
    private int helper(TreeNode node, int minVal, int maxVal) {
        if (node == null) {
            return maxVal - minVal;
        }

        minVal = Math.min(minVal, node.val);
        maxVal = Math.max(maxVal, node.val);

      
        int leftDiff = helper(node.left, minVal, maxVal);
      int rightDiff = helper(node.right, minVal, maxVal);

        return Math.max(leftDiff, rightDiff);
    }
}
