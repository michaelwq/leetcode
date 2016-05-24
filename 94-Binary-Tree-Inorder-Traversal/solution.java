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
//     List<Integer> result=new ArrayList<Integer>();
// 	public List<Integer> inorderTraversal(TreeNode root) {
// 		test(root);
// 		return result;
	
// 	}
// 	void test(TreeNode root){
// 		if(root!=null){
// 			if(root.left!=null){
// 				test(root.left);
// 			}
// 			result.add(root.val);
// 			if(root.right!=null){
// 				test(root.right);
// 			}
// 		}
// 	}


public List<Integer> inorderTraversal(TreeNode root) {
    ArrayList<Integer> lst = new ArrayList<Integer>();
 
        if(root == null)
            return lst; 
 
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //define a pointer to track nodes
        TreeNode p = root;
 
        while(!stack.empty() || p != null){
 
            // if it is not null, push to stack
            //and go down the tree to left
            if(p != null){
                stack.push(p);
                p = p.left;
 
            // if no left child
            // pop stack, process the node
            // then let p point to the right
            }else{
                TreeNode t = stack.pop();
                lst.add(t.val);
                p = t.right;
            }
        }
 
        return lst;
    }

}