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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack=new Stack<TreeNode>();
		int counter=1;
		while(!stack.isEmpty()||root!=null){
			if(root!=null){
				stack.push(root);
				root=root.left;
			}else{
			
				TreeNode top=stack.pop();
				if(k==counter){
					return top.val;
				}else{
					counter++;	
				}
				root=top.right;
			}
			
		}
		
		return 0;
    }
}