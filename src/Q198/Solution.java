package Q198;

public class Solution {

	public static int rob(int[] nums) {
		int rob = 0;
		int notrob=0;
		for(int i=0;i<nums.length;i++){
			int tmp=notrob;
			notrob=Math.max(rob, notrob);
			rob=tmp+nums[i];
			
		}
		return Math.max(rob, notrob);
	}

//	public static void main(String[] args) {
//		int[] a = {  1};
//		System.out.print(rob(a));
//	}

}
