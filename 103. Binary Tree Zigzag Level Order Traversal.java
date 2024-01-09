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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
	    if(root==null) return arr;
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.add(root);
        int f = 1;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i<levelSize; i++){
                TreeNode node = queue.remove();
                temp.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);                    
            }
            if(f<0) Collections.reverse(temp);
            arr.add(temp);
            f= f*-1;
        }
        
        return arr;
    }
}
