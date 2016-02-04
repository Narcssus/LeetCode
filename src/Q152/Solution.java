package Q152;

import java.lang.Math;

public class Solution {

	public static int maxProduct(int[] nums) {
		if(nums.length==1) return nums[0];
		int max=0;
		int min=0;
		int tmp;
		int ans=0;
		for(int i=0;i<nums.length;i++){
			tmp=max;
			max=Math.max(Math.max(tmp*nums[i], min*nums[i]), nums[i]);
			min=Math.min(Math.min(tmp*nums[i], min*nums[i]), nums[i]);
			ans=Math.max(ans, max);
		}
		
		return ans;
	}




//	public static void main(String[] args) {
//		int[] a = {2,-1,1,1};
//		System.out.print(maxProduct(a));
//
//	}

}
