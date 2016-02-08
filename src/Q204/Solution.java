package Q204;

public class Solution {
	public static int countPrimes(int n) {
		boolean[] notPrimes = new boolean[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (notPrimes[i]==false) {
				count++;
				for(int j=2;j*i<n;j++){
					notPrimes[i*j]=true;
				}
			}

		}	
		return count;
	}

//	public static void main(String[] args) {
//		System.out.print(countPrimes(499979));
//	}
}
