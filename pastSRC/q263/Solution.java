package q263;

public class Solution {
	 public static boolean isUgly(int num) {
	        if(num==0) return false;
	        while(num!=1){
	        	if(num%2!=0&&num%3!=0&&num%5!=0)	return false;
	        	if(num%2==0) num=num/2;
	        	if(num%3==0) num=num/3;
	        	if(num%5==0) num=num/5;
	        }
	        if(num==1) return true;
	        
	        return true;
	    }
//	public static void main(String[] args) {
//		System.out.print(isUgly(2*3*5*2+1));
//	}

}
