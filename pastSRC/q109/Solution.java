package q109;

import TreeNode.*;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		return sortedListToBST(head, null);
	}
	public TreeNode sortedListToBST(ListNode head, ListNode end) {
		if (head == end)
			return null;
		if (head.next == end) {
			TreeNode root = new TreeNode(head.val);
			return root;
		}
		ListNode slow = head, fast = head;
		while (fast.next != end && fast.next.next != end) {
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.right = sortedListToBST(slow.next, end);
		root.left = sortedListToBST(head, slow);
		return root;
	}

}
