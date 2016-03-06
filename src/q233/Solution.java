package q233;

public class Solution {

	public int countDigitOne(int n) {
		if(n<=0) return 0;
		int sum=0;
		int num=n;
		int tmp=1;
		int dight;
		do{
			dight=num%10;
			num=num/10;
			sum+=num*tmp;
			if(dight>1){
				sum+=tmp;
			}
			if(dight==1){
				sum+=n%tmp+1;
			}
			
			tmp*=10;
		}while(num>0);
		
		
		return sum;
	}
	
	
//
//	public static void main(String[] args) {
//		Solution s=new Solution();
//		System.out.println(s.countDigitOne(116));
//	}

}
