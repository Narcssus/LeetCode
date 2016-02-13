package Q160;

public class Solution {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null||headB==null)	return null;
		ListNode tmp=new ListNode(-1);
		int lenA=0,lenB=0;
		tmp=headA;
		while(tmp!=null){
			tmp=tmp.next;
			lenA++;
		}
		tmp=headB;
		while(tmp!=null){
			tmp=tmp.next;
			lenB++;
		}
		while(lenA>lenB){
			headA=headA.next;
			lenA--;
		}
		while(lenA<lenB){
			headB=headB.next;
			lenB--;
		}
		while(headA!=headB){
			headA=headA.next;
			headB=headB.next;
		}
		
		
		
		
		return headA;

	}
//
//	public static void main(String[] args) {
//	}

}
