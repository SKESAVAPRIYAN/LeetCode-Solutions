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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, inorder, new int[]{0}, 0, inorder.length - 1);
    }
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int[] preIndex, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }
        int rootVal = preorder[preIndex[0]];
        TreeNode root = new TreeNode(rootVal);
        preIndex[0]++;

        int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        root.left = buildTreeHelper(preorder, inorder, preIndex, inStart, rootIndex - 1);
        root.right = buildTreeHelper(preorder, inorder, preIndex, rootIndex + 1, inEnd);

        return root;
    }
}
