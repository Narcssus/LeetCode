package q024;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {

	public ListNode swapPairs(ListNode head) {
		if (head == null)
			return head;
		if (head.next == null)
			return head;
		ListNode h2 = head.next;
		head.next = swapPairs(h2.next);
		h2.next = head;
		return h2;
	}
}
