
public class balanced_binary_tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public boolean isBalanced(TreeNode root){
		if(root == null){
			return true;
		}else{
			int height = getHeight(root);
			if(height <= 0){
				return false;
			}else{
				return true;
			}
		}
	}
	
	public int getHeight(TreeNode x){
		int leftHeight = 0; 
		int rightHeight = 0;
		if(x.left == null && x.right == null){		//递归终止条件
			return 1;
		}else{
			if(x.left != null){
				leftHeight = getHeight(x.left);
			}
			if(x.right != null){
				rightHeight = getHeight(x.right);
			}
			if(leftHeight > rightHeight + 1 || rightHeight > leftHeight + 1 || leftHeight == -1 || rightHeight == -1){	//如果刚出现不平衡或者已经出现了不平衡就返回0
				return -1;
			}else{			//否则返回1
				return (leftHeight > rightHeight) ? (leftHeight + 1) : (rightHeight + 1);
			}
		}		
	}
}
