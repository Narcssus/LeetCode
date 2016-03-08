package q108;

import TreeNode.*;

public class Solution {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length < 1)
			return null;
		TreeNode root = helper(nums, 0, nums.length - 1);
		return root;

	}

	public TreeNode helper(int[] nums, int i, int j) {
		if (i > j)
			return null;
		int mid = (i + j) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.right = helper(nums, i, mid - 1);
		root.left = helper(nums, mid + 1, j);
		return root;
	}
//
//	public static void main(String[] args) {
//		int[] a = { 1, 2 };
//		Solution s = new Solution();
//		TreeNode root = s.sortedArrayToBST(a);
//		Codec c = new Codec();
//		System.out.print(c.serialize(root));
//	}

}
