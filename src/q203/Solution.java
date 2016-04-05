package q203;

public class Solution {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return head;
		ListNode a, b;
		a = head;
		b = head.next;
		while (b != null) {
			if (b.val == val)
				a.next = b.next;
			else
				a = b;
			b = b.next;
		}
		if (head.val == val)
			return head.next;
		return head;

	}
}
