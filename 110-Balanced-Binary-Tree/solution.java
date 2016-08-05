/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        if (root.left != null && root.left.val >= root.val){
            return false;
        }
        if (root.right != null && root.right.val >= root.val){
            return false;
        }
        return ( isValidBST(root.left) && isValidBST(root.right));
    }
}