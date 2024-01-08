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
    int counter = 0;
    public int kthSmallest(TreeNode root, int k) {
        return inorder(root, k);
    }

    private Integer inorder(TreeNode root, int k) {
        if (root == null) return null;

        Integer left = inorder(root.left, k);
        if (left != null) return left;

        counter++;
        if (counter == k) {
            return root.val;
        }

        Integer right = inorder(root.right, k);
        if (right != null) return right;

        return null;
    }
}
