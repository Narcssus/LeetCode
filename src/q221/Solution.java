package q221;

public class Solution {

	public int maximalSquare(char[][] matrix) {
		int m=matrix.length;
		if(m<1) return 0;
		int n=matrix[0].length;
		if(n<0) return 0;
		int max=0;
		int[][] len=new int[m+1][n+1];
		for(int i=0;i<m;i++){
			if(matrix[i][0]=='1'){
				len[i][0]=1;
				max=1;
			}
			else len[i][0]=0;
		}
		for(int i=0;i<n;i++){
			if(matrix[0][i]=='1'){
				len[0][i]=1;
				max=1;
			}
			else len[0][i]=0;
		}
		
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				if(matrix[i][j]=='1'){
					len[i][j]=Math.min(Math.min(len[i-1][j], len[i][j-1]), len[i-1][j-1])+1;
					max=Math.max(max, len[i][j]);
				}
				else{
					len[i][j]=0;
				}
				
			}
		}
		
		
		return max*max;
	}

//	public static void main(String[] args) {
//
//	}

}
