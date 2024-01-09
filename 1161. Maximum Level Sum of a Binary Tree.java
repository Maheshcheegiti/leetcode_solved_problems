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
    public int maxLevelSum(TreeNode root) {

        if(root==null) return 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max = Integer.MIN_VALUE, maxlevel= 0,c=0;
        while(!q.isEmpty()){
            int n = q.size();
            int sum = 0;
            c++;
            for(int i = 0;i<n; i++){
                TreeNode temp = q.remove();
                sum += temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            if(sum>max){
                max = sum;
                maxlevel =c;
            }
        }
        return maxlevel;
    }
}
