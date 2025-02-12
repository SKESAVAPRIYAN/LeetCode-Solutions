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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<Integer>();
        if(root==null) return li;
        Stack<TreeNode> st=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            st2.push(root);
            if(root.left!=null) st.push(root.left);
            if(root.right!=null) st.push(root.right);
        }
        while(!st2.isEmpty()){
            li.add(st2.pop().val);
        }
        return li;
    }
}