package q079;

public class Solution {
	public static boolean exist(char[][] board, String word) {

		boolean isexist = false;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					board[i][j] = '#';
					isexist = isexist || helper(board, word, i, j, 1);
					board[i][j] = word.charAt(0);
				}
			}
		}
		return isexist;
	}

	public static boolean helper(char[][] board, String word, int i, int j,
			int num) {
		if (num == word.length())
			return true;
		boolean find = false;
		char tmp = word.charAt(num);
		if (i - 1 >= 0 && board[i - 1][j] == tmp) {
			board[i - 1][j] = '#';
			find = find || helper(board, word, i - 1, j, num + 1);
			board[i - 1][j] = tmp;
		}
		if (i + 1 < board.length && board[i + 1][j] == tmp) {
			board[i + 1][j] = '#';
			find = find || helper(board, word, i + 1, j, num + 1);
			board[i + 1][j] = tmp;
		}
		if (j - 1 >= 0 && board[i][j - 1] == tmp) {
			board[i][j - 1] = '#';
			find = find || helper(board, word, i, j - 1, num + 1);
			board[i][j - 1] = tmp;
		}
		if (j + 1 < board[0].length && board[i][j + 1] == tmp) {
			board[i][j + 1] = '#';
			find = find || helper(board, word, i, j + 1, num + 1);
			board[i][j + 1] = tmp;
		}
		return find;
	}

//	public static void main(String[] args) {
//		char[][] a = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' },
//				{ 'A', 'D', 'E', 'E' } };
//		String b = "ABCCED";
//		System.out.print(exist(a, b));
//	}

}
