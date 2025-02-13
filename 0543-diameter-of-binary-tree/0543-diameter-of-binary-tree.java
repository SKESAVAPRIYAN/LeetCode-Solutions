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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] a=new int[1];
        height(root,a);
        return a[0];
    }
    int height(TreeNode root,int[] a){
        if(root ==null) return 0;
        int l=height(root.left,a);
        int r=height(root.right,a);
        a[0]=Math.max(a[0],l+r);
        return Math.max(l,r)+1;
    }
}