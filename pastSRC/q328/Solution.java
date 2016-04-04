package q328;

public class Solution {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode oddEvenList(ListNode head) {
		ListNode odd = null;
		ListNode even = null;
		ListNode oddhead = null;
		ListNode evenhead = null;
		int tmp = 1;
		while (head != null) {
			if (tmp % 2 != 0) {
				if (odd == null) {
					odd = head;
					oddhead = head;
				} else {
					odd.next = head;
					odd = odd.next;
				}
			} else {
				if (even == null) {
					even = head;
					evenhead = head;
				} else {
					even.next = head;
					even = even.next;
				}
			}
			head = head.next;
			tmp++;
		}
		if(even!=null) even.next=null;
		if(odd!=null) odd.next = evenhead;
		return oddhead;
	}


}
