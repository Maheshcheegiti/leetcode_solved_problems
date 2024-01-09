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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> arr = new ArrayList<>();
        
        if(root==null) return -1;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int n = q.size();
            Long sum = 0L;
            for(int i = 0;i<n; i++){
                TreeNode temp = q.remove();
                sum+=temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            arr.add(sum);
        }
        Collections.sort(arr);
        if(arr.size()-k<0) return -1;
        return arr.get(arr.size()-k);
    }
}
