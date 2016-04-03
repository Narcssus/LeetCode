package q094;

import java.util.ArrayList;
import java.util.List;

import TreeNode.*;

public class Solution {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		helper(root, ans);
		return ans;
	}

	public void helper(TreeNode root, List<Integer> list) {
		if (root == null)
			return;
		helper(root.left, list);
		list.add(root.val);
		helper(root.right, list);
	}

}
