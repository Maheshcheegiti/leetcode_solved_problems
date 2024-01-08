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
    public boolean findTarget(TreeNode root, int target) {
        ArrayList<Integer>arr = new ArrayList<>();
        
        solve(root,arr);
        
        int l = 0, r = arr.size()-1;
        while(l<=r){
            if(arr.get(l)+arr.get(r)==target) return true;
            if(arr.get(l)+arr.get(r)<target){
                l++;
            }else{
                r--;
            }
        }
        return false;
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
