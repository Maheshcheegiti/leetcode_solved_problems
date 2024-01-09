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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return true;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int f = 1;
        while(!q.isEmpty()){
            int n = q.size();
            int prev1 = Integer.MIN_VALUE, prev2 = Integer.MAX_VALUE;
            for(int i = 0;i<n; i++){
                TreeNode temp = q.remove();
                if(f>0 && (temp.val%2==0 || temp.val<=prev1)) return false;
                else if(f<0 && (temp.val%2==1 || temp.val>=prev2)) return false;
                prev1 = temp.val;
                prev2 = temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            f = f*-1;
        }
        
        return true;
    }
}
