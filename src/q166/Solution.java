package q166;

import java.util.HashMap;
import java.util.Map;


public class Solution {

	public String fractionToDecimal(int numerator, int denominator) {
		String ans = "";
		int symbol = 1;
		long mydenominator=(long)denominator;
		long mynumerator=(long)numerator;
		if (mynumerator < 0) {
			symbol *= -1;
			mynumerator *= -1;
		}
		if (mydenominator < 0) {
			symbol *= -1;
			mydenominator *= -1;
		}
		if (symbol < 0&&mynumerator>0)
			ans += "-";
		if (mynumerator / mydenominator > 0)
			ans += mynumerator / mydenominator + "";
		else if(mynumerator / mydenominator==0) ans += "0";
			
			
		if (mynumerator % mydenominator == 0)
			return ans;
		else {
			ans += ".";
			int i = 0;
			long a = mynumerator;
			Map<Long,Integer> m=new HashMap<Long,Integer>();
			a -= (Math.ceil(a / mydenominator)) * mydenominator;
			m.put(a, ans.length());
			while (i++ < 3000&&a!=0) {
				a *= 10;
				if(a / mydenominator<0) ans += -a / mydenominator;
				else ans += a / mydenominator;
				a -= (Math.ceil(a / mydenominator)) * mydenominator;
				if(m.containsKey(a)){
					ans=ans.substring(0,m.get(a))+"("+ans.substring(m.get(a))+")";
					break;
				}else{
					m.put(a, ans.length());
				}
			}
		}
		return ans;

	}
	
//
//	public static void main(String[] args) {
//		Solution s = new Solution();
//		System.out.println(s.fractionToDecimal(-2147483648,-1));
//	}

}
