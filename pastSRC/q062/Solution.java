package q062;

public class Solution {

	public int uniquePaths(int m, int n) {
		int[][] pathsum=new int[m][n];
		pathsum[0][0]=1;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(i-1>=0) pathsum[i][j]+=pathsum[i-1][j];
				if(j-1>=0) pathsum[i][j]+=pathsum[i][j-1];
			}
		}
		
		
		
		return pathsum[m-1][n-1];
	}

//	public static void main(String[] args) {
//		Solution s=new Solution();
//		System.out.print(s.uniquePaths(1,2));
//	}

}
