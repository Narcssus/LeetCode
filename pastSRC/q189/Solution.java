package q189;

public class Solution {

	public static void rotate(int[] nums, int k) {
		if(nums.length<2) return;
		while(nums.length<k){
			k=k-nums.length;
		}
		helper(nums,0,nums.length-1);
		helper(nums,0,k-1);
		helper(nums,k,nums.length-1);
	}	 
	
	public static void helper(int[] nums,int begin,int end){
		while(begin<end){
			nums[begin]=nums[begin]^nums[end];
			nums[end]=nums[begin]^nums[end];
			nums[begin]=nums[begin]^nums[end];
			begin++;
			end--;
		}
		
	}
	
//	public static void main(String[] args) {
//		int[] a={1,2,3,4,5,6,7};
//		rotate(a,11);
//		for(int i=0;i<a.length;i++){
//			System.out.print(a[i]+" ");
//		}
//	}

}
