package Q306;

import java.math.BigInteger;

public class Solution {
	
	
	
	public static boolean isAdditiveNumber(String num) {
		for(int i=1;i<num.length()/2+1;i++){
			if(isAdditive(num,i)) return true;
		}
		return false;
	}
	
	public static boolean isAdditive(String num,int begin) {
		String sum="";
		String a,b;
		for(int i=begin;i<num.length()/2+1;i++){
			for(int j=1;j<num.length()/2+1;j++){
				sum=add(num.substring(0,i),num.substring(i,i+j));
				a=num.substring(0,i);
				b=num.substring(i,i+j);
				//c=num.substring(i+j, i+j+sum.length());
				if(a.length()>1&&a.charAt(0)=='0') continue;
				if(b.length()>1&&b.charAt(0)=='0') continue;
				if(sum.equals(num.substring(i+j))) return true;
				else if(sum.length()>num.length()-i-j) continue;
				else if(sum.length()<num.length()-i-j){
					if(sum.equals(num.substring(i+j, i+j+sum.length()))){
						return isAdditiveNumber(num.substring(i));
					}
					else continue;
				}
			}
		}
		return false;
	}
	
	public static String add(String num1,String num2){
		 BigInteger x1 = new BigInteger(num1);
		 BigInteger x2 = new BigInteger(num2);
		 BigInteger x3= x1.add(x2);
		 
		return x3.toString();
		
	}
	
	
//	public static void main(String[] args) {
//			System.out.print(isAdditiveNumber("12122436"));
//	}

}
