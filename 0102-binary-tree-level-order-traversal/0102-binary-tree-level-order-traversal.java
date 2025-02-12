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
    public List<List<Integer>> levelOrder(TreeNode root) {
     Queue <TreeNode> qu=new LinkedList<>();
     List<List<Integer>>  li=new LinkedList<List<Integer>>();
     if(root ==null) return li;
     qu.offer(root);
     while(!qu.isEmpty()){
        int s=qu.size();
        List<Integer> sub=new LinkedList<>();
        for(int i=0;i<s;i++){
            if(qu.peek().left!=null) qu.offer(qu.peek().left);
            if(qu.peek().right!=null) qu.offer(qu.peek().right);
            sub.add(qu.poll().val);
        }
        li.add(sub);
     }
     return li;
    }
}