package q130;

public class Solution {
	public int[][] helper(char[][] board) {
		int m = board.length;
		int n = board[0].length;
		int[][] qi = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				qi[i][j] = 0;
			}
		}

		for (int i = 0; i < m; i++) {
			qi[i][n - 1] = board[i][n - 1] == 'X' ? 0 : 1;
			qi[i][0] = board[i][0] == 'X' ? 0 : 1;
		}
		for (int i = 0; i < n; i++) {
			qi[m - 1][i] = board[m - 1][i] == 'X' ? 0 : 1;
			qi[0][i] = board[0][i] == 'X' ? 0 : 1;
		}
		System.out.println();
		for (int k = 0; k < m; k++) {
			for (int i = 1; i < m - 1; i++) {
				for (int j = 1; j < n - 1; j++) {
					qi[i][j] = (board[i][j] == 'X') ? 0 : qi[i - 1][j]
							| qi[i][j - 1] | qi[i][j + 1] | qi[i + 1][j];
				}
			}
		}

		return qi;
	}

	public void solve(char[][] board) {
		int m, n;
		if (board == null || board.length == 0 || board[0].length == 0)
			return;
		m = board.length;
		n = board[0].length;
		int[][] qi = helper(board);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (qi[i][j] == 0)
					board[i][j] = 'X';
			}
		}

	}
	//
	// public static void main(String[] args) {
	// Solution s = new Solution();
	// char[][] c = { "OXOOOX".toCharArray(), "OOXXXO".toCharArray(),
	// "XXXXXO".toCharArray(), "OOOOXX".toCharArray(),
	// "XXOOXO".toCharArray(), "OOXXXX".toCharArray() };
	// int[][] p = s.helper(c);
	// for (int i = 0; i < c.length; i++) {
	// for (int j = 0; j < c[0].length; j++) {
	// System.out.print(c[i][j] + " ");
	// }
	// System.out.println();
	//
	// }
	// System.out.println();
	// for (int i = 0; i < c.length; i++) {
	// for (int j = 0; j < c[0].length; j++) {
	// System.out.print(p[i][j] + " ");
	// }
	// System.out.println();
	//
	// }
	// System.out.println();
	//
	// }

}
