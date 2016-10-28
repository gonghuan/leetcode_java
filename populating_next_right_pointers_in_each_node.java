package approach2;

public class populating_next_right_pointers_in_each_node2 {
	public class TreeLinkNode {
		public int val;
		public TreeLinkNode left;
		public TreeLinkNode right;
		public TreeLinkNode next;
		public TreeLinkNode(int x) { val = x; }
	}
	
	public void connect(TreeLinkNode root) {
		if(root == null){
			return;
		}else{
			TreeLinkNode previous = root; 
			TreeLinkNode present = null;
			TreeLinkNode head = null;
			while(previous.left != null){
				while(previous != null){
					if(present == null){
						present = previous.left;
//						System.out.println(present.val);
						present.next = previous.right;
						head = present;
						present = present.next;
//						System.out.println(present.val);
						previous = previous.next;
					}else{
						present.next = previous.left;
						present = present.next;
//						System.out.println(present.val);
						present.next = previous.right;
						present = present.next;
//						System.out.println(present.val);
						previous = previous.next;
					}
				}
				previous = head;
				present = null;
			}
		}
    }
	
}
