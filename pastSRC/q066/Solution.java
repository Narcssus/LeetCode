package q066;

public class Solution {
	public int[] plusOne(int[] digits) {
		int n = digits.length;
		int i;
		int tmp = 1;
		int[] ans;
		for (i = n - 1; i >= 0; i--) {
			if (tmp == 1) {
				digits[i] += 1;
				tmp = 0;
				if (digits[i] == 10) {
					digits[i] = 0;
					tmp = 1;
				}
			}
		}
		if (i < 0 && tmp == 1) {
			ans = new int[n + 1];
			ans[0] = 1;
			for (int j = 0; j < n; j++) {
				ans[j + 1] = digits[j];
			}
		} else {
			ans = new int[n];
			for (int j = 0; j < n; j++) {
				ans[j] = digits[j];
			}
		}

		return ans;

	}
}
