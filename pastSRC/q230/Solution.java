package q230;

import java.util.ArrayList;
import java.util.List;

import TreeNode.*;

public class Solution {
	public int kthSmallest(TreeNode root, int k) {
		List<Integer> q = new ArrayList<Integer>();
		helper(root, q);

		return q.get(k - 1);

	}

	public void helper(TreeNode root, List<Integer> q) {
		if (root == null)
			return;
		helper(root.left, q);
		q.add(root.val);
		helper(root.right, q);
	}
}
