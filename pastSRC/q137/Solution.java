package q137;

public class Solution {
	public int singleNumber(int[] nums) {
		int a=0,b=0,c;
		int tmp;
		for(int i=0;i<nums.length;i++){
			c=nums[i];
			tmp=(a&~b&~c)|(~a&~b&c);
			b=(~a&b&~c)|(a&~b&c);
			a=tmp;
		}
		
		
		return a;
	}

//	public static void main(String[] args) {
//		Solution s=new Solution();
//		int[] a={1,1,2,4,1,2,2};
//		System.out.print(s.singleNumber(a));
//	}
}
