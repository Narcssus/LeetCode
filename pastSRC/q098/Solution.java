package q098;

import TreeNode.*;

public class Solution {

	public boolean isValidBST(TreeNode root) {
		return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
	}

	public boolean helper(TreeNode root, long left, long right) {
		if (root == null)
			return true;
		if (root.val <= left || root.val >= right)
			return false;

		return helper(root.left, left, root.val)
				&& helper(root.right, root.val, right);
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
