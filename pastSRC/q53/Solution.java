package q53;

public class Solution {
	public static int maxSubArray(int[] nums) {
		if(nums.length==1) return nums[0];
		int max=nums[0];
		int tmp;
		int ans=nums[0];
		for(int i=1;i<nums.length;i++){
			tmp=max;
			max=Math.max(nums[i], tmp+nums[i]);
			ans=Math.max(ans, max);
		}
		return ans;
	}

//	public static void main(String[] args) {
//		int[] a={-2,-1};
//		System.out.print(maxSubArray(a));
//	}

}
