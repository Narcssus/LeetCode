package q26;

public class Solution {
	public static int removeDuplicates(int[] nums) {
		if (nums.length < 1)
			return 0;
		int duplicates = 0;
		int tmp = nums[0];
		int j=1;
		for (int i = 1; i < nums.length; i++) {
			if (tmp == nums[i])
				duplicates++;
			else {
				tmp = nums[i];
				nums[j] = nums[i];
				j++;
			}
		}
		
		return nums.length-duplicates;
	}

//	public static void main(String[] args) {
//		int[] a = { 1, 1,2 };
//		System.out.println(removeDuplicates(a));
//		for(int i=0;i<a.length;i++){
//			System.out.print(a[i]+" ");
//		}
//		
//	}

}
