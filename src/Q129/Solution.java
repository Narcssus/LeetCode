package Q129;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void getNums(TreeNode t,List<Integer> nums,int tmp) {
		tmp=tmp*10+t.val;
		if(t.left!=null) getNums(t.left,nums,tmp);
		if(t.right!=null) getNums(t.right,nums,tmp);
		if(t.left==null&&t.right==null){
			nums.add(tmp);
			tmp=(tmp-t.val)/10;
		}
	}

	public static int sumNumbers(TreeNode root) {
		int ans = 0;
		List<Integer> nums = new ArrayList<Integer>();
		if (root == null)
			return 0;
		getNums(root,nums,0);
		for (int i = 0; i < nums.size(); i++) {
			ans = ans + nums.get(i);
//			System.out.println(nums.get(i));
		}

		return ans;
	}

//	public static void main(String[] args) {
//		TreeNode a = new TreeNode(8);
//		TreeNode b = new TreeNode(3);
//		TreeNode c = new TreeNode(5);
//		TreeNode d = new TreeNode(9);
//		TreeNode e = new TreeNode(9);
//		TreeNode f = new TreeNode(5);
//		a.left = b;
//		a.right = c;
//		b.right = d;
//		d.left = e;
//		d.right = f;
//
//		System.out.println(sumNumbers(a));
//	}

}
