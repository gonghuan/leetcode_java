
public class path_sum {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) return false;
		else return hasPathSum(root, root.val, sum);
    }
	//递归查找每条路径之和是否等于sum
	public boolean hasPathSum(TreeNode root, int tmp_sum, int sum){
		boolean left = false;
		boolean right = false;
		if(root.left == null && root.right == null){
			if(tmp_sum == sum) return true;
			else return false;
		}else{
			if(root.left != null){
				left = hasPathSum(root.left, tmp_sum + root.left.val, sum);
			}
			if(root.right != null){
				right = hasPathSum(root.right, tmp_sum + root.right.val, sum);
			}
			return left || right;
		}
	}
}
