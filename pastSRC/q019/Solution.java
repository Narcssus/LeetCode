package q019;

public class Solution {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode tmp = head;
		ListNode now = head;
		ListNode n_now = head;
		for (int i = 0; i < n; i++) {
			n_now = n_now.next;
		}
		while (n_now != null) {
			tmp = now;
			now = now.next;
			n_now = n_now.next;
		}

		if (tmp != now)
			tmp.next = now.next;
		else
			return head.next;

		return head;

	}
}
