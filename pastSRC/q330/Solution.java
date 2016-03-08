package q330;

public class Solution {
	public int minPatches(int[] nums, int n) {
		int sum = 0;
		long now = 1;
		int i = 0;
		while (now <= n) {
			if (i<nums.length&&nums[i] <= now) {
				now += nums[i++];
			} else {
				now+=now;
				sum++;
			}

		}

		return sum;
	}

//	public static void main(String[] args) {
//		Solution s = new Solution();
//		int[] a = { 1, 2, 31, 33 };
//		System.out.println(s.minPatches(a, Integer.MAX_VALUE));
//	}

}
