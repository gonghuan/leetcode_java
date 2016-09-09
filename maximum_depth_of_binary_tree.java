package maximum_depth_of_binary_tree;

/**
 * Definition for binary tree */

import java.util.Stack;
public class Solution {
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
    Stack<TreeNode> stack = new Stack<TreeNode>();
	int maxValue = 0;
    public int maxDepth(TreeNode root) {
        if(root == null && stack.isEmpty()){
				return maxValue;
			}
		else{
				stack.push(root);
		        int value = stack.size();
		        if(value > maxValue) maxValue = value;
		        if(root.left != null){
		        	maxDepth(root.left);
		        }
		        if(root.right != null){
		        	maxDepth(root.right);
		        }
		        stack.pop();
		        return maxValue;
			}
    }
}
