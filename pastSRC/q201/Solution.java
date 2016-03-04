package q201;

public class Solution {

	public static int rangeBitwiseAnd(int m, int n) {
		int test=Integer.MAX_VALUE;
		while((m&test)!=(n&test)) test=test<<1;
		return n&test;
	}

//	public static void main(String[] args) {
//		System.out.print(rangeBitwiseAnd(110, 111));
//	}

}
