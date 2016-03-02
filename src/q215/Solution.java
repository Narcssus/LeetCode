package q215;

public class Solution {

	public static int findKthLargest(int[] nums, int k) {
		if (k > nums.length)
			return 0;
		return helper(nums, nums.length-k, 0, nums.length - 1);

	}

	public static int helper(int[] nums, int k, int begin, int end) {
		int tmp;
		int a = nums[begin];
		int i = begin, j = end;
		if (begin == end)
			return a;
		while (i < j) {
			while (nums[i] <= a && i < end)
				i++;
			while (a < nums[j] && j >= begin)
				j--;
			if (i < j) {
				tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
			}
		}
		tmp = nums[j];
		nums[begin] = nums[j];
		nums[j] = tmp;

		if (j == k)
			return a;
		else if (j > k)
			return helper(nums, k, begin, j - 1);
		else
			return helper(nums, k, j + 1, end);
	}

//	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 4, 5, 6 };
//		System.out.println(findKthLargest(a, 4));
//	}

}
