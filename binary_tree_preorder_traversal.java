import java.util.ArrayList;

public class binary_tree_preorder_traversal {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public ArrayList<Integer> list = new ArrayList<>();
	
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
        	return list;
        }else{
        	list.add(root.val);
        	if(root.left != null){
        		preorderTraversal(root.left);
        	}
        	if(root.right != null){
        		preorderTraversal(root.right);
        	}
        	return list;
        }
    }
}
