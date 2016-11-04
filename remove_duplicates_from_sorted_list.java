
public class remove_duplicates_from_sorted_list {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) {
			 val = x;
			 next = null;
		 }
	}
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null){
			return head;
		}else{
			int val = head.val;
	        ListNode temp = head; 
	        while(temp.next != null){
	        	if(temp.next.val != val){
	        		temp = temp.next;
	        		val = temp.val;
	        	}else{
	        		temp.next = temp.next.next;
	        	}
	        }
	        return head;
		}
    }
}
