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
    List<Integer> result=new ArrayList<Integer>();
	public List<Integer> inorderTraversal(TreeNode root) {
		test(root);
		return result;
	
	}
	void test(TreeNode root){
		if(root!=null){
			if(root.left!=null){
				test(root.left);
			}
			result.add(root.val);
			if(root.right!=null){
				test(root.right);
			}
		}
	}
}