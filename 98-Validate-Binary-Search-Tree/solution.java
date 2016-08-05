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
    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return true;
        }
        int left = getVal(root.left, root.val);
        int right = getVal(root.right, root.val);
        if( left < root.val && right > root.val){
            return true;
        }else{
            return false;
        }
    }
    public int getVal(TreeNode root, int parent) {
        int left = root.val - 1;
        int right = root.val + 1;
        if (root.left != null){
            left = getVal(root.left, true, root.val);
        }
        if (root.right != null){
            right = getVal(root.right, false, root.val);
        }
        if( left < root.val && right > root.val){
            return left;
        }else{
            return parent;
        }
    }
}