package q74;

public class Solution {

	public static boolean BinarySearch(int[] a, int target) {
		int i = 0;
		int j = a.length - 1;
		do {
			if (a[(i + j) / 2] == target||a[i]==target||a[j]==target)
				return true;
			else if (a[(i + j) / 2] > target) {
				j = (i + j) / 2;
			} else if (a[(i + j) / 2] < target) {
				i = (i + j) / 2;
			}
		} while (j-i>1);
		return (a[j] == target)||(a[i]==target);
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix[0].length;
		int i = 0;
		int j = matrix.length - 1;

		do {
			if (matrix[(i + j) / 2][0] == target
					|| matrix[(i + j) / 2][m - 1] == target)
				return true;
			if (matrix[(i + j) / 2][0] < target
					&& matrix[(i + j) / 2][m - 1] > target) {
				return BinarySearch(matrix[(i + j) / 2], target);
			}
			if (matrix[(i + j) / 2][0] > target) {
				j = (i + j) / 2;
			}
			if (matrix[(i + j) / 2][m - 1] < target) {
				i = (i + j) / 2;
			}
		} while (j-i>1);
		return BinarySearch(matrix[j], target)||BinarySearch(matrix[i], target);
	}

//	public static void main(String[] args) {
//		int[][] m = { {1},{3},{5}};
//		System.out.println(searchMatrix(m, 1));
////		System.out.println(searchMatrix(m, 2));
////		System.out.println(searchMatrix(m, 3));
////		System.out.println(searchMatrix(m, 4));
////		System.out.println(searchMatrix(m, 5));
////		System.out.println(searchMatrix(m, 6));
//
//		
//	}

}
