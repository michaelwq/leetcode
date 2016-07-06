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
    public int rob(TreeNode root) {
        int[] num=dfs_rob(root);
		return Math.max(num[0], num[1]);
    }
	
	private int[] dfs_rob(TreeNode root){
		int[] res=new int[2];
		if(root==null) return res;
		
		int[] left=dfs_rob(root.left);
		int[] right=dfs_rob(root.right);
		
		res[0]=root.val+left[1]+right[1];
		res[1]=Math.max(left[0], left[1])+Math.max(right[0], right[1]);
		
		return res;
		
	}
}