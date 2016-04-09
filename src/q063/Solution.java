package q063;

public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] dp = new int[m][n];
		if (obstacleGrid[0][0] == 1)
			return 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				dp[i][j] = 0;
			}
		}
		dp[0][0] = 1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= 1 && obstacleGrid[i][j] != 1) {
					dp[i][j] += dp[i - 1][j];
				}
				if (j >= 1 && obstacleGrid[i][j] != 1) {
					dp[i][j] += dp[i][j - 1];
				}

			}
		}

		return dp[m - 1][n - 1];
	}

}
