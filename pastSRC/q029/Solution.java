package q029;

public class Solution {

	public int divide(int dividend, int divisor) {
		long mydividend = dividend;
		long mydivisor = divisor;
		if (mydivisor == 0)
			return Integer.MAX_VALUE;
		int tmp = 1;
		if (mydividend < 0) {
			mydividend = -mydividend;
			tmp = -tmp;
		}
		if (mydivisor < 0) {
			mydivisor = -mydivisor;
			tmp = -tmp;
		}
		if (mydividend < mydivisor)
			return 0;
		long[] bits = new long[31];
		bits[0] = mydivisor;
		int i;
		for (i = 1; i <= 30; i++) {
			bits[i] = bits[i - 1] + bits[i - 1];
			if (bits[i] > mydividend)
				break;
		}
		i--;
		long ans = 0;
		while (mydividend >= mydivisor) {
			mydividend -= bits[i];
			ans += 1 << i;
			while (i > 0 && bits[i] > mydividend)
				i--;
		}
		ans = ans * tmp;
		if (ans > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		return (int) ans;
	}

}
