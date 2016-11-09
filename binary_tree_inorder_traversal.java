import java.util.ArrayList;

public class binary_tree_inorder_traversal {
	 public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	 }
	 public ArrayList<Integer> list = new ArrayList<>();
	 public ArrayList<Integer> inorderTraversal(TreeNode root) {
		 if(root == null){return list;}
		 else{
			 if(root.left != null)	inorderTraversal(root.left);
	         list.add(root.val);
	         if(root.right != null) inorderTraversal(root.right);
	         return list;
		 }    
     }
}
