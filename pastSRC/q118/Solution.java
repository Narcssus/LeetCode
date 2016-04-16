package q118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<Integer>();
		if (numRows <= 0)
			return ans;
		int k = 0;
		for (int i = 0; i <= numRows; i++) {
			for (int j = 0; j < i; j++) {
				if (j == 0)
					tmp.add(1);
				else if (j == i - 1)
					tmp.add(1);
				else {
					k = ans.get(i - 1).get(j - 1);
					k += ans.get(i - 1).get(j);
					tmp.add(k);
				}
			}
			ans.add(new ArrayList<Integer>(tmp));
			tmp.clear();
		}

		ans.remove(0);
		return ans;
	}
}