package q112;

import TreeNode.*;

public class Solution {
	private boolean finded;

	public boolean hasPathSum(TreeNode root, int sum) {
		helper(root, sum);
		return finded;
	}

	public void helper(TreeNode root, int sum) {
		if (root == null)
			return;
		if (sum == root.val && root.left == null && root.right == null)
			finded = true;

		helper(root.left, sum - root.val);
		helper(root.right, sum - root.val);

	}

}
