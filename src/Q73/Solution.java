package Q73;

public class Solution {
	public static void setZeroes(int[][] matrix) {
		int m=matrix.length;
		int n=matrix[0].length;
		int[] lines =new int[m];
		int[] rows=new int[n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j]==0){
					lines[i]=1;
					rows[j]=1;
				}
			}
		}
		for(int i=0;i<m;i++){
			if(lines[i]==1){
				for(int j=0;j<n;j++){
					matrix[i][j]=0;
				}
			}
		}
		for(int j=0;j<n;j++){
			if(rows[j]==1){
				for(int i=0;i<m;i++){
					matrix[i][j]=0;
				}
			}
		}
		
	}

//	public static void main(String[] args) {
//		int[][] a={{0}};
//		setZeroes(a);
//		
//		for(int i=0;i<a.length;i++){
//			for(int j=0;j<a[0].length;j++){
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		
//		
//	}
}
