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
        ArrayList<TreeNode> arr = new ArrayList<>();
        preorder(root, arr);
        TreeNode t = new TreeNode(0);
        TreeNode h = t;
        for(TreeNode i : arr){
            i.left = null;
            t.right = i;
            t = t.right;
        }
        h.right = null;
    }
    public void preorder(TreeNode root, ArrayList<TreeNode> arr){
        if(root==null) return;
        arr.add(root);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }
}
