package Q273;

public class Solution {

	public static String linkWords(String a, String b) {
		if (a.length() > 0 && b.length() > 0)
			return a + " " + b;
		else
			return a + b;
	}

	public static String linkWords(String a, String b, String c) {
		String tmp = "";

		if (a.length() > 0 && b.length() > 0)
			tmp = a + " " + b;
		else
			tmp = a + b;

		if (tmp.length() > 0 && c.length() > 0)
			return tmp + " " + c;
		else
			return tmp + c;
	}

	public static String getWords(int num) {
		String[] number = { "", "One", "Two", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
				"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
				"Eighteen", "Nineteen" };
		String[] number2 = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
				"Sixty", "Seventy", "Eighty", "Ninety" };
		String ans = "";
		if (num / 100 > 0)
			ans = linkWords(ans, number[num / 100]) + " " + "Hundred";
		if (num % 100 < 20) {
			ans = linkWords(ans, number[num % 100]);
		} else {
			ans = linkWords(ans, number2[(num % 100) / 10]);
			ans = linkWords(ans, number[(num % 10)]);
		}
		return ans;
	}

	public static String numberToWords(int num) {
		if (num == 0)
			return "Zero";
		String ans = "";
		String[] number3 = { "", "Thousand", "Million", "Billion" };
		int tmp = num % 1000;
		int tmp2 = num / 1000;
		int i = 0;
		while (tmp2 > 0) {
			if(tmp!=0)	ans = linkWords(getWords(tmp), number3[i], ans);
			else ans=linkWords(getWords(tmp),ans);
			i++;
			tmp = (tmp2) % 1000;
			tmp2 = tmp2 / 1000;
		}
		if (tmp > 0){
			if (i > 0 && ans.equals(number3[i - 1]))
				ans = "";
			ans = linkWords(getWords(tmp), number3[i++], ans);
			
		}
			

		return ans;
	}

//	public static void main(String[] args) {
//		System.out.println(numberToWords(100000010));
//	}

}
