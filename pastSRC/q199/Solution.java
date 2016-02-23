package q199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode end = new TreeNode(-1);
		TreeNode tmp;
		if (root == null)
			return ans;
		q.add(root);
		q.add(end);
		int before = 0;
		while (!q.isEmpty()) {
			tmp = q.poll();
			if (tmp == end&&!q.isEmpty()) {
				q.add(end);
				ans.add(before);
			} else {
				if (tmp != null) {
					before = tmp.val;
					q.add(tmp.left);
					q.add(tmp.right);
				}
			}
		}
		return ans;
	}

//	public static void main(String[] args) {
//		TreeNode a1 = new TreeNode(1);
//		TreeNode a2 = new TreeNode(2);
//		TreeNode a3 = new TreeNode(3);
//		TreeNode a4 = new TreeNode(4);
//		TreeNode a5 = new TreeNode(5);
//		
//		a1.left=a2;
//		a1.right=a3;
//		
//		System.out.print(rightSideView(a1).toString());
//		
//
//	}

}
