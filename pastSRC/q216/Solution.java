package q216;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> now = new ArrayList<Integer>();
		helper(k, n, now, ans);

		return ans;
	}

	public static void helper(int k, int n, List<Integer> now, List<List<Integer>> ans) {
		if (k == 0 && n == 0) {
			ans.add(new ArrayList<Integer>(now));
			return;
		}
		if (k == 0 && n != 0) {
			return;
		}
		int begin = 0;
		if (now.size() > 0)
			begin = now.get(now.size() - 1);
		for (int i = begin+1; i <= n && i <= 9; i++) {
			if (k > 0) {
				now.add(i);
				helper(k - 1, n - i, now, ans);
				now.remove(now.size()-1);
			}
		}

	}
//
//	public static void main(String[] args) {
//		List<List<Integer>> ans = combinationSum3(3,111);
//		System.out.print(ans.toString());
//	}

}
