package q113;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

}

public class Solution {
	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<Integer>();
		GetPath(root, sum, ans, tmp);
		return ans;
	}

	public static void GetPath(TreeNode root, int sum, List<List<Integer>> ans,
			List<Integer> tmp) {
		if (root == null)
			return;

		
		tmp.add(root.val);
		sum -= root.val;
		if (sum == 0 && root.right == null && root.left == null) {
			ans.add(new ArrayList<Integer>(tmp));
			tmp.remove(tmp.size() - 1);
			return;
		}

		if (root != null && root.left != null)
			GetPath(root.left, sum, ans, tmp);
		if (root != null && root.right != null)
			GetPath(root.right, sum, ans, tmp);
		tmp.remove(tmp.size() - 1);
	}

//	public static void main(String[] args) {
//
//		TreeNode a = new TreeNode(1);
//		TreeNode b = new TreeNode(2);
//		TreeNode c = new TreeNode(3);
//		a.left = b;
//		a.right = c;
//		List<List<Integer>> ans = pathSum(a, 3);
//		System.out.println(ans.toString());
//
//	}

}
