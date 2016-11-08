
public class merge_two_sorted_lists {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		    next = null;
		}
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null){
			return l2;
		}else if(l2 == null){
			return l1;
		}else{
			ListNode previous1 = null;	//指向present1的前面一个
			ListNode present1 = l1;		//遍历第一个链表的指针
			ListNode present2 = l2;		//遍历第二个链表的指针
			while(present1 != null && present2 != null){
				if(present1.val <= present2.val){
					while(present1.next != null && present1.next.val <= present2.val){
						present1 = present1.next;
					}
					ListNode temp = present2.next;	//先缓存present2的next
					present2.next = present1.next;	//将present2插到present1的后面
					present1.next = present2;	
					present2 = temp;				//present2变成l2的后一个
					previous1 = present1.next;
					present1 = present1.next.next;	//present1变成原来l1的后一个
				}else{
					l2 = present2;
					while(present2.next != null && present2.next.val <= present1.val){
						present2 = present2.next;
					}
					if(previous1 == null){			//头节点时
						ListNode temp = present2.next;
						present2.next = present1;
						l1 = l2;
						previous1 = present2;
						present2 = temp;
					}else{
						ListNode temp = present2.next;
						present2.next = present1;
						previous1.next = l2;
						previous1 = present1.next;
						present2 = temp;
					}
				}
			}
			if(present1 == null && present2 != null){		//当l1已经遍历结束，将l2中剩余的都放入l1， 当l2遍历结束，则算法终止
				previous1.next = present2;
			}
			return l1;
		}
	}
}
