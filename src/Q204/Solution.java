package Q204;


public class Solution {
	public static int countPrimes(int n) {
		int now=2;
		int i=0;
		int mark=1;
		int count=0;
		if (n == 0 || n == 1 || n == 2)
			return 0;
		while (now < n) {
			mark=1;
			i=2;
			while(i*i<=now){
				if(now%i==0){
					mark=0;
				}
				i++;
			}
			if(mark==1){
				count++;
			}
			now++;
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.print(countPrimes(499979));
	}
}
