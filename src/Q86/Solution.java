package Q86;

public class Solution {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode partition(ListNode head, int x) {
		ListNode left=null;
		ListNode right=null;
		ListNode lefthead=null;
		ListNode righthead=null;
		while(head!=null){
			if(head.val<x){
				if(left==null){
					lefthead=head;
					left=head;
				}
				else left.next=head;
				left=head;
			}
			else{
				if(right==null){
					righthead=head;
					right=head;
				}
				else right.next=head;
				right=head;
				
			}
			head=head.next;
		}
		if(left==null&&right==null) return null;
		else if(left!=null){
			left.next=righthead;
		}
		else{
			lefthead=righthead;
		}
		if(right!=null) right.next=null;
		
		
		return lefthead;
	}

//	public static void main(String[] args) {
//		
//		ListNode a1=new ListNode(1);
//		ListNode a2=new ListNode(4);
//		ListNode a3=new ListNode(3);
//		ListNode a4=new ListNode(2);
//		ListNode a5=new ListNode(5);
//		ListNode a6=new ListNode(2);
//		
//		a1.next=a2;
//		a2.next=a3;
//		a3.next=a4;
//		a4.next=a5;
//		a5.next=a6;
//		
//		ListNode b= partition(a6, 1);
//		while(b!=null){
//			System.out.print(b.val+" ");
//			b=b.next;
//		}
		
		
		
//	}

}
