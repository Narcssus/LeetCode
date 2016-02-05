package Q1;

import java.util.Arrays;

public class Solution {
	
	public static int getMax(int[] nums){
		int max=0;
		for(int i=0;i<nums.length;i++)	max=Math.max(max, nums[i]);
		return max;
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] ans={0,0};
		int[] index =new int[getMax(nums)+1];
		for(int i=nums.length-1;i>=0;i--){
			index[nums[i]]=i;
		}
		Arrays.sort(nums);
		int tmp=0;
		int i=0;
		while(i<nums.length-1){
			tmp=nums[i]+nums[i+1];
			if(tmp>target)	return ans;
			else if(tmp==target){
				ans[0]=Math.min(index[nums[i]],index[nums[i+1]])+1;
				ans[1]=Math.max(index[nums[i]],index[nums[i+1]])+1;
				return ans;
			}
			else continue;
			
		}
		
		
        return ans;
    }
	
	public static void main(String[] args) {
		int a[]={2, 7, 11, 15};
		int t=9;
		System.out.print(twoSum(a, t)[0]+" "+twoSum(a, t)[1]);
		
	}

}
