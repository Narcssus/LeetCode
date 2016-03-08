package q096;

public class Solution {

	public int numTrees(int n) {
		if(n<1) return 0;
		int[] num=new int[n+1];
		num[0]=1;
		num[1]=1;
		for(int i=2;i<=n;i++){
			for(int j=1;j<=i;j++){
				num[i]+=num[j-1]*num[i-j];
			}
		}
		return num[n];
	}

//	public static void main(String[] args) {
//		Solution s=new Solution();
//		System.out.print(s.numTrees(0));
//
//	}

}
