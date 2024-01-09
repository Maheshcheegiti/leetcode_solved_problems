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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        inorder(root1,arr1);
        inorder(root2,arr2);
        return arr1.equals(arr2);
    }

    public void inorder(TreeNode root, ArrayList<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        if(root.left==null && root.right==null) list.add(root.val);
        inorder(root.right,list);
    }
}
