package q309;

public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length < 2)
			return 0;
		int m = prices.length;
		int[] buy = new int[m];
		int[] sell = new int[m];
		buy[0] = -prices[0];
		buy[1] = Math.max(buy[0], -prices[1]);
		sell[0] = 0;
		sell[1] = Math.max(0, prices[1] - prices[0]);
		for (int i = 2; i < m; i++) {
			buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
			sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
		}
		return Math.max(sell[m - 2], sell[m - 1]);
	}
}