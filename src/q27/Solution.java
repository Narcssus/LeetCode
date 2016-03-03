package q27;

public class Solution {

	public static int removeElement(int[] nums, int val) {
		if (nums.length < 1)
			return 0;
		int sum=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				nums[sum]=nums[i];
				sum++;
			}
		}
		return sum;
	}

//	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 4 };
//		System.out.print(a.length + " " + removeElement(a, 2));
//	}

}
