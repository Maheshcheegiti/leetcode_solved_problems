// Big O 1 Solution
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    static TreeNode res;
    public String serialize(TreeNode root) {
        res = root;
        return "";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return res;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
|
// General Solution

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder st = new StringBuilder();
        if(root==null) st.append('N');
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                st.append("N,");
                continue;
            }
            st.append(curr.val+",");
            q.add(curr.left);
            q.add(curr.right);
        }
        return st.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        int n = data.length();
        if(n==0) return null;
        if(data.charAt(0)=='N') return null;
        String ch[] = data.split(",");
        System.out.println(Arrays.toString(ch));
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(ch[0]));
        q.add(root);
        int i = 0;
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            
            if(++i<n && !ch[i].equals("N")){
                curr.left = new TreeNode(Integer.parseInt(ch[i]));
                q.add(curr.left);
            }
            
            if(++i<n && !ch[i].equals("N")){
                curr.right = new TreeNode(Integer.parseInt(ch[i]));
                q.add(curr.right);
            }        
            
            
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
