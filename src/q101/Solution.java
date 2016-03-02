package q101;

import TreeNode.TreeNode;

public class Solution {

	public static boolean isSymmetric(TreeNode root) {
		if(root==null) return true;
		return helper(root.left, root.right);
	}

	public static boolean helper(TreeNode left, TreeNode right) {
		if (left == null && right == null )
			return true;
		else if (left == null && right != null || left != null && right == null)
			return false;

		if (left.val == right.val) {
			return helper(left.left, right.right)
					&& helper(left.right, right.left);
		} else
			return false;
	}

//	public static void main(String[] args) {
//		TreeNode root = Codec_TLE.deserialize("1,2,3");
//		System.out.print(isSymmetric(root));
//	}

}
