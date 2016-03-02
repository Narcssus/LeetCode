package q162;

public class Solution {
	public static int findPeakElement(int[] nums) {
		return helper(nums,0,nums.length-1);
	}
	
	public static int helper(int[] nums,int begin,int end){
		if(begin==end) return begin;
		if(begin+1==end){
			if(nums[begin]>nums[end])	return begin;
			else return end;
		}
		
		
		int mid=(begin+end)/2;
		if(nums[mid-1]<nums[mid]&&nums[mid]>nums[mid+1]){
			return mid;
		}
		else if(nums[mid-1]<nums[mid]&&nums[mid]<nums[mid+1]){
			return helper(nums,mid+1,end);
		}
		else if(nums[mid-1]>nums[mid]&&nums[mid]>nums[mid+1]){
			return helper(nums,begin,mid-1);
		}
		else{
			return helper(nums,begin,mid-1);
		}
	}
	
	
//	public static void main(String[] args){
//		int[] a={1,10,3,4,5,1};
//		System.out.print(findPeakElement(a));
//	}	
}
