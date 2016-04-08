package q022;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<String>();
		helper(ans, "", n, n);
		return ans;
	}

	public void helper(List<String> ans, String tmp, int n, int m) {
		if (n == 0 && m == 0)
			ans.add(new String(tmp));
		if (n >= 1)
			helper(ans, tmp + "(", n - 1, m);
		if (m >= 1 && n < m)
			helper(ans, tmp + ")", n, m - 1);

	}
}
