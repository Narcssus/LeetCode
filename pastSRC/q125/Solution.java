package q125;

public class Solution {

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char a = s.charAt(i);
			char b = s.charAt(j);
			if (!Character.isLetter(a) && !Character.isDigit(a))
				i++;
			else if (!Character.isLetter(b) && !Character.isDigit(b))
				j--;
			else {
				if (Character.toLowerCase(a) != Character.toLowerCase(b))
					return false;
				i++;
				j--;
			}

		}
		return true;
	}

//	public static void main(String[] args) {
//		System.out.print(isPalindrome(""));
//
//	}

}
