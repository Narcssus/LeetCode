package q39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void getComb(int[] candidates, int target, List<Integer> tmp,
			List<List<Integer>> ans,int j) {
		for (int i = j; i < candidates.length; i++) {
			if (target == 0) {
				ans.add(new ArrayList<Integer>(tmp));
				return;
			}
			if (target < 0 || candidates[i] > target) {
				break;
			} else {
				if (target - candidates[i] >= 0) {
					tmp.add(candidates[i]);
					getComb(candidates, target - candidates[i], tmp, ans,i);
					tmp.remove(tmp.size()-1);
				}
			}
		}

	}

	public static List<List<Integer>> combinationSum(int[] candidates,
			int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		List<Integer> tmp = new ArrayList<Integer>();
		getComb(candidates, target, tmp, ans,0);

		return ans;
	}

//	public static void main(String[] args) {
//		int[] a = { };
//		System.out.println(combinationSum(a, 1).toString());
//	}

}
