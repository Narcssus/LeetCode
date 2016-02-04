package Q152;

import java.lang.Math;

public class Solution {

	public static int maxProduct(int[] nums) {
		int left, right;
		left = 0;
		right = 0;
		int max = 0;
		int ZeroSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums.length == 1)
				return nums[0];
			if (nums[i] == 0) {
				ZeroSum++;
				if (left == 0) {
					right = i - 1;
					if(right>=0)	max = getProduct(nums, 0, right);
					left = i + 1;
				} else if (ZeroSum % 2 == 1) {
					left = i + 1;
					if (left > right) {
						max = Math.max(max, getMax(nums, left, nums.length - 1));
						max=Math.max(max, getMax(nums,right+2,i-1));
					}
				} else if (ZeroSum % 2 == 0) {
					right = i - 1;
					max = Math.max(max, getMax(nums, left, right));
					max = Math.max(max, getMax(nums, i + 1, nums.length - 1));
					left=i+1;
				}
			}
		}
		if (ZeroSum == 0) {
			max = getMax(nums, 0, nums.length - 1);
		}
		if (ZeroSum == 1) {
			max = Math.max(getMax(nums, 0, right),
					getMax(nums, left, nums.length - 1));
		}
		if(max<0&&ZeroSum>0)	return 0;
		return max;
	}

	public static int getMax(int[] nums, int begin, int end) {
		int left = 0;
		int right = 0;
		int minusSum = 0;
		if(begin>end) return -1;
		
		for (int i = begin; i <= end; i++) {
			if (nums[i] < 0) {
				if (left == 0)
					left = i;
				minusSum++;
				right = i;
			}
		}
		if (minusSum % 2 == 0)
			return getProduct(nums, begin, end);
		else {
			int maxtmp=0;
			maxtmp=Math.max(getProduct(nums, begin, right - 1),
					getProduct(nums, left , end));
			maxtmp=Math.max(maxtmp, getProduct(nums, left+1 , end));
			return maxtmp;
		}

	}

	public static int getProduct(int[] nums, int begin, int end) {
		int tmp = 1;
		if(begin>end)	return -1;
		for (int i = begin; i <= end; i++)
			tmp *= nums[i];
		return tmp;
	}

	public static void main(String[] args) {
		int[] a = {-3,3,-1,-2,2,2};
		System.out.print(maxProduct(a));

	}

}
