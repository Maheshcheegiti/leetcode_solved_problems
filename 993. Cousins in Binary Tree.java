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
    public boolean isCousins(TreeNode root, int a, int b) {
        TreeNode p1 = null;
        TreeNode p2 = null;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            boolean c1 = false;
            boolean c2 = false;

            for(int i = 0 ; i<n ; i++){
                TreeNode curr = q.remove();

                if(curr.left!=null){
                    int val = curr.left.val;

                    if(!c1 && val == a){
                        c1 = true;
                        p1 = curr;
                    }

                    if(!c2 && val == b){
                        c2 = true;
                        p2 = curr;
                    }

                    q.add(curr.left);
                }

                if(curr.right!=null){
                    int val = curr.right.val;

                    if(!c1 && val == a){
                        c1 = true;
                        p1 = curr;
                    }

                    if(!c2 && val == b){
                        c2 = true;
                        p2 = curr;
                    }

                    q.add(curr.right);
                }
            }

            if(c1 && c2){
                return p1 != p2;
            }
        }
        return false;
    }
}
