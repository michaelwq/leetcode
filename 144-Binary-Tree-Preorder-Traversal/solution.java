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
    public List<Integer> preorderTraversal(TreeNode root) {
		test(root);
		return result;
        
    }
	
	public void test(TreeNode root){
		if(root!=null){
			result.add(root.val);
			if(root.left!=null){
			test(root.left);
    		}
    		if(root.right!=null){
    			test(root.right);
    		}
		}
		
	}
}