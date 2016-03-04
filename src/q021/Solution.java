package q021;

public class Solution {

	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode tmp = null;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				if (head == null) {
					head = l1;
					tmp = l1;
				} else {
					tmp.next = l1;
					tmp = tmp.next;
				}
				l1 = l1.next;
			} else {
				if (head == null) {
					head = l2;
					tmp = l2;
				} else {
					tmp.next = l2;
					tmp = tmp.next;
				}
				l2 = l2.next;
			}

		}
		while (l1 != null) {
			if (head == null) {
				head = l1;
				tmp = l1;
			} else {
				tmp.next = l1;
				tmp = tmp.next;
			}
			l1 = l1.next;
		}
		while (l2 != null) {
			if (head == null) {
				head = l2;
				tmp = l2;
			} else {
				tmp.next = l2;
				tmp = tmp.next;
			}
			l2 = l2.next;
		}

		return head;
	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ListNode a1 = new ListNode(1);
//		ListNode a2 = new ListNode(2);
//		ListNode a3 = new ListNode(3);
//		a1.next = a2;
//		a2.next = a3;
//
//		ListNode ans = mergeTwoLists(null, a1);
//		while (ans != null) {
//			System.out.print(ans.val + " ");
//			ans = ans.next;
//		}
//
//	}

}
