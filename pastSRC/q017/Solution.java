package q017;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static List<String> getLetter(List<String> tmp, String digits) {
		List<String> ans = new ArrayList<String>();
		if (tmp.size() > 0) {
			for (int i = 0; i < digits.length(); i++) {
				for (int j = 0; j < tmp.size(); j++) {
					ans.add(tmp.get(j) + digits.charAt(i));
				}
			}

		}
		else{
			for (int i = 0; i < digits.length(); i++) {
					ans.add(digits.charAt(i)+"");
			}
		}
		return ans;
	}

	public static List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<String>();
		List<String> digits2letters = new ArrayList<String>();
		digits2letters.add(" ");
		digits2letters.add("");
		digits2letters.add("abc");
		digits2letters.add("def");
		digits2letters.add("ghi");
		digits2letters.add("jkl");
		digits2letters.add("mno");
		digits2letters.add("pqrs");
		digits2letters.add("tuv");
		digits2letters.add("wxyz");
		if (digits.length() < 1)
			return ans;
		for (int i = 0; i < digits.length(); i++) {
			if(digits.charAt(i) - 48==1||digits.charAt(i) - 48==0) return new ArrayList<String>();
			ans = getLetter(ans, digits2letters.get(digits.charAt(i) - 48));
		}

		return ans;
	}

//	public static void main(String[] args) {
//		String a = "123";
//		System.out.println(letterCombinations(a).toString());
//	}

}
