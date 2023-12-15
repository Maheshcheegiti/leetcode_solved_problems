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
    int prev = 0, count = 0, mcount =0;
    ArrayList<Integer> arr = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] ans = new int[arr.size()];
        for(int i = 0; i< arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev == root.val){
            count++;
        }else{
            count = 1;
        }
        if(count==mcount){
            arr.add(root.val);
        }else if(count>mcount){
            mcount = count;
            arr.clear();
            arr.add(root.val);
        }
        prev = root.val;
        inorder(root.right);
    }
}
