package q054;

import java.util.*;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<Integer>();
		if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
			return ans;
		int coldown = matrix.length - 1;
		int rowright = matrix[0].length - 1;
		int colup = 0;
		int rowleft = 0;
		while (colup <= coldown && rowleft <= rowright) {
			for (int i = rowleft; i <= rowright; i++) {
				ans.add(matrix[colup][i]);
			}
			colup++;

			for (int i = colup; i <= coldown; i++) {
				ans.add(matrix[i][rowright]);
			}
			rowright--;

			if (colup <= coldown) {
				for (int i = rowright; i >= rowleft; i--) {
					ans.add(matrix[coldown][i]);
				}
			}
			coldown--;

			if (rowleft <= rowright) {
				for (int i = coldown; i >= colup; i--) {
					ans.add(matrix[i][rowleft]);
				}
			}
			rowleft++;
		}
		return ans;
	}
}
