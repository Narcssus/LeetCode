package q151;

public class Solution {

	public static String reverseWords(String s) {
		String ans = "";
		String tmp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				if (tmp.length() > 0) {
					if (ans.length() > 0)
						ans = tmp + " " + ans;
					else
						ans = tmp;
				}
				tmp = "";
			} else {
				tmp += s.charAt(i);
			}

		}
		if (tmp.length() > 0) {
			if (ans.length() > 0)
				ans = tmp + " " + ans;
			else
				ans = tmp;
		}

		return ans;
	}

//	public static void main(String[] args) {
//		String a = " aasdaafdf";
//		System.out.println(reverseWords(a));
//	}

}
