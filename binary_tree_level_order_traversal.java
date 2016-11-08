import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class binary_tree_level_order_traversal {
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	 }
	 
	 public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
	     if(root == null){
	    	 return new ArrayList<>();
	     }else{
	    	 //层次遍历需要两个队列完成
	    	 Queue<TreeNode> level1 = new LinkedList<>();		//第一个队列
		     Queue<TreeNode> level2 = new LinkedList<>();		//第二个队列
		     ArrayList<ArrayList<Integer>> result = new ArrayList<>();	//返回结果
		     level1.add(root);								//首先将第一个队列设置为根节点的值
		     while(!level1.isEmpty() || !level2.isEmpty()){
		    	 ArrayList<Integer> temp1 = new ArrayList<>();	//存放每一层的int值
		    	 while(!level1.isEmpty()){
			    	 TreeNode present = level1.poll();		//取出队列中的值
			    	 temp1.add(present.val);
			    	 if(present.left != null){
			    		 level2.add(present.left);
			    	 }
			    	 if(present.right != null){
			    		 level2.add(present.right);
			    	 }
			     }
		    	 if(temp1.size() > 0){
		    		 result.add(temp1);
		    	 }
		    	 ArrayList<Integer> temp2 = new ArrayList<>();	//存放每一层的int值
		    	 while(!level2.isEmpty()){
			    	 TreeNode present = level2.poll();		//取出队列中的值
			    	 temp2.add(present.val);
			    	 if(present.left != null){
			    		 level1.add(present.left);
			    	 }
			    	 if(present.right != null){
			    		 level1.add(present.right);
			    	 }
			     }
		    	 if(temp2.size() > 0){
		    		 result.add(temp2);
		    	 }
		     }
		     return result;
	     }
	 }
}
