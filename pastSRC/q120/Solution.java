package q120;

import java.util.List;

public class Solution {

	public int minimumTotal(List<List<Integer>> triangle) {
		int m = triangle.size();
		int tmp;
		for (int i = m - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				tmp = triangle.get(i).get(j)
						+ Math.min(triangle.get(i + 1).get(j),
								triangle.get(i + 1).get(j + 1));
				triangle.get(i).set(j, tmp);
			}
		}
		return triangle.get(0).get(0);
	}
}
