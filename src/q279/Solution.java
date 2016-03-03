package q279;

public class Solution {

	public static int numSquares(int n) {
		if(n==0) return 0;
		int[] numSq=new int[n+1];
		for(int i=1;i<=n;i++){
			numSq[i]=i;
			for(int j=1;j<=Math.sqrt(i);j++){
			 	numSq[i]=Math.min(numSq[i-j*j]+1,numSq[i]);
			}
		}
		return numSq[n];
	}


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(numSquares(4	));
//	}

}
