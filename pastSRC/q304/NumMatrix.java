package q304;

public class NumMatrix {

	private int[][] sum;
	private int m = 0, n = 0;

	public NumMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return;
		}

		m = matrix.length;
		n = matrix[0].length;

		sum = new int[m + 1][n + 1];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1]
						+ matrix[i - 1][j - 1];
			}
		}

	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		if (m == 0 || n == 0)
			return -1;
		if (row1 >= m || row1 < 0)
			return -1;
		if (row2 >= m || row2 < 0)
			return -1;
		if (col1 >= n || row2 < 0)
			return -1;
		if (col2 >= n || row2 < 0)
			return -1;
		return sum[row2 + 1][col2 + 1] - sum[row2 + 1][col1]
				- sum[row1][col2 + 1] + sum[row1][col1];
	}
}
