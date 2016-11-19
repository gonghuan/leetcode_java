
public class construct_binary_tree_from_preorder_and_inorder_traversal {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder.length == 0 || inorder.length == 0){
			return null;
		}
		else{
			TreeNode root = new TreeNode(preorder[0]);
	        return buildPartitialTree(preorder, inorder, 0, inorder.length - 1, root);
		}  
    }
	
	public int pre_present = 0;	//全局变量，在preorder中的索引，每次加1
	
	public TreeNode buildPartitialTree(int[] preorder, int[] inorder, int begin, int end, TreeNode present){	
		//分治构造二叉树
		if(begin == end){
			return new TreeNode(inorder[begin]);
		}else{
			for(int i = begin; i <= end; i++){
				if(inorder[i] == preorder[pre_present]){
					if(i > begin){	//左子树非空
						present.left = buildPartitialTree(preorder, inorder, begin, i - 1, new TreeNode(preorder[++pre_present]));
					}else{
						present.left = null;
					}
					if(i < end){	//右子树非空
						present.right = buildPartitialTree(preorder, inorder, i + 1, end, new TreeNode(preorder[++pre_present]));
					}else{
						present.right = null;
					}
					break;
				}
			}
			return present;
		}
	}
}
