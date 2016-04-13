package q031;

public class Solution {

	public void nextPermutation(int[] nums) {
		int n = nums.length;
		if (n <= 1)
			return;
		int i;
		for (i = n - 1; i >= 1; i--) {
			if (nums[i] > nums[i - 1])
				break;
		}
		if (i == 0) {
			reverse(nums, 0, n - 1);
		} else {
			int val = nums[i - 1];
			int j = n - 1;
			while (j >= i) {
				if (nums[j] > val)
					break;
				j--;
			}
			swap(nums, j, i - 1);
			reverse(nums, i, n - 1);
		}

	}

	public void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
		// nums[i] = nums[i] ^ nums[j];
		// nums[j] = nums[i] ^ nums[j];
		// nums[i] = nums[i] ^ nums[j];
	}

	public void reverse(int[] nums, int s, int e) {
		if (s > e)
			return;
		for (int i = s; i <= (s + e) / 2; i++)
			swap(nums, i, s + e - i);
	}

}
