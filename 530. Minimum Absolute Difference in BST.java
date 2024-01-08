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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer>arr = new ArrayList<>();
        
        solve(root,arr);
        int curr = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size()-1; i++){
            if(arr.get(i+1)-arr.get(i)<curr){
                curr = arr.get(i+1)-arr.get(i);
            }
        }
        return curr;
    }
    
    
    public void solve(TreeNode root, ArrayList<Integer>list){
        if(root==null){
            return;
        }
        
        solve(root.left,list);
        list.add(root.val);
        solve(root.right,list);
    }
}
