package q235;

import java.util.*;

import TreeNode.*;

public class Solution {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		List<List<TreeNode>> path = new ArrayList<List<TreeNode>>();
		List<TreeNode> tmp = new ArrayList<TreeNode>();
		tmp.add(root);
		helper(tmp, root, p, path);
		helper(tmp, root, q, path);
		for (int i = path.get(0).size() - 1; i >= 0; i--) {
			for (int j = path.get(1).size() - 1; j >= 0; j--) {
				if (path.get(0).get(i) == path.get(1).get(j))
					return path.get(0).get(i);
			}
		}
		return null;

	}

	public void helper(List<TreeNode> path, TreeNode root, TreeNode target,
			List<List<TreeNode>> ans) {
		if (root == target) {
			ans.add(new ArrayList<TreeNode>(path));
			return;
		} else {
			if (root.left != null) {
				path.add(root.left);
				helper(path, root.left, target, ans);
				path.remove(path.size() - 1);
			}
			if (root.right != null) {
				path.add(root.right);
				helper(path, root.right, target, ans);
				path.remove(path.size() - 1);
			}

		}

	}

	// public static void main(String[] args) {
	// Solution s = new Solution();
	// Codec c = new Codec();
	// TreeNode root = c
	// .deserialize("6,2,8,0,4,7,9,null,null,3,5,null,null,null,null");
	// TreeNode p = c.getNode(root, 2);
	// TreeNode q = c.getNode(root, 8);
	// // System.out.println(p.val);
	// // System.out.println(q.val);
	// TreeNode ans = s.lowestCommonAncestor(root, p, q);
	// System.out.println(ans.val);
	//
	// }
}
