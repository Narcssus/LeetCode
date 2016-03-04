package q209;

public class Solution {

	public static int minSubArrayLen(int s, int[] nums) {
		int minLen=Integer.MAX_VALUE;
		int i=0,j=0;
		int sum=0;
		if(nums.length<1) return 0;
		while(i<nums.length){
			if(j>=nums.length&&sum<s) break;
			while(j<nums.length&&sum<s){
				sum=sum+nums[j];
				j++;
			}
			if(sum>=s){
				sum=sum-nums[i];
				minLen=Math.min(minLen, j-i);
				i++;
			}
		}
		if(minLen==Integer.MAX_VALUE) return 0;
		return minLen;
	}

//	public static void main(String[] args) {
//		int[] a={1,2,3,4,5};
//		System.out.print(minSubArrayLen(11,a));
//	}

}
