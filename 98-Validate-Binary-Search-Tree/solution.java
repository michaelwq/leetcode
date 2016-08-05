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
        int left = getVal(root.left, true, root.val);
        int right = getVal(root.right, false, root.val);
        if( left < root.val && right > root.val){
            return true;
        }else{
            return false;
        }
    }
    public int getVal(TreeNode root, boolean isLeft, int parent) {
        if (root == null){
            if (isLeft){
                return parent - 1;
            }else{
                return parent + 1;
            }
        }
        if (root.val == parent){
            retuen parent;
        }
        int left = getVal(root.left, true, root.val);
        int right = getVal(root.right, false, root.val);
        if( left < root.val && right > root.val){
            if (isLeft){
                return left;
            }else{
                return right;
            }
        }else{
            return parent;
        }
    }
}