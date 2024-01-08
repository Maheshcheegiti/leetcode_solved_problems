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
    // int sum = 0, f= 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        // inorder(root,low,high);
        // return sum;
        if (root == null) {
            return 0;
        }

        // If the current node's value is within the range, add it to the sum
        int sum = 0;
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        // Recursively explore the left and right subtrees if they can possibly contain values in the range
        if (root.val > low) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (root.val < high) {
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;
    }
    // public void inorder(TreeNode root, int low, int high){
    //     if(root==null) return;
    //     inorder(root.left, low, high);
    //     if(f==0 && root.val>=low){
    //         f=1;
    //     }
    //     if(f==1 && root.val>high){
    //         f=0;
    //     }
    //     if(f==1){
    //         sum += root.val;
    //     }
    //     inorder(root.right,low,high);
    // }
}
