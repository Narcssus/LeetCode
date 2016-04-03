package q268;

public class Solution {

	public int missingNumber(int[] nums) {
		int m=nums.length;
		int ans=(m+1)*m/2;
		for(int i=0;i<nums.length;i++){
			ans-=nums[i];
		}
		return ans;
	}

//	public static void main(String[] args) {
//		int[] a={0,1,2,3,4,5};
//		Solution s=new Solution();
//		System.out.println(s.missingNumber(a));
//
//	}

}
