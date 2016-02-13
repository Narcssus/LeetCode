package Q142;

public class Solution {
	static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	 }
	
	public static ListNode detectCycle(ListNode head) {
		ListNode quick=head;
		ListNode slow=head;
		int mark=0;
		if(head==null) return null;
		while(quick.next!=null&&quick.next.next!=null){
			quick=quick.next.next;
			slow=slow.next;
			if(quick==slow){
				mark=1;
				break;
			}
			
		}
		if(mark==0) return null;
		quick=head;
		while(quick!=slow){
			quick=quick.next;
			slow=slow.next;
		}
		
		return slow;
	}
	
//	public static void main(String[] args){
//		ListNode a1= new ListNode(1);
//		ListNode a2= new ListNode(2);
//		ListNode a3= new ListNode(3);
//		ListNode a4= new ListNode(4);
//		ListNode a5= new ListNode(5);
//		ListNode a6= new ListNode(6);
//		ListNode a7= new ListNode(7);
//		ListNode a8= new ListNode(8);
//		a1.next=a2;
//		a2.next=a3;
//		a3.next=a4;
//		a4.next=a5;
//		a5.next=a6;
//		a6.next=a7;
//		a7.next=a8;
//		a8.next=a4;
//		System.out.print(detectCycle(a1).val);
//	}
	
	
}
