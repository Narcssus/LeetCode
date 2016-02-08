package Q141;

public class Solution {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static boolean hasCycle(ListNode head) {
		if(head==null) return false;
		ListNode slow=head;
		ListNode quick=head;
		while(quick!=null&&quick.next!=null){
			slow=slow.next;
			quick=quick.next;
			quick=quick.next;
			if(slow==quick)	return true;
		}
		
		return false;
	}

//	public static void main(String[] args) {
//		ListNode a=new ListNode(1);
//		ListNode b=new ListNode(2);
//		ListNode c=new ListNode(0);
//		ListNode d=new ListNode(-4);
//		a.next=b;
//		
//		System.out.print(hasCycle(a));
//	}

}
