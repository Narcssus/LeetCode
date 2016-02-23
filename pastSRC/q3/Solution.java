package q3;

public class Solution {
	public static int lengthOfLongestSubstring(String s) {
		if (s.length() < 1)
			return 0;
		return GetMaxLen(FindLen(s));

	}

	public static int GetMaxLen(int[] SameLen) {
		int max = 0;
		int newMax = 0;
		for (int i = 0; i < SameLen.length; i++) {
			if (SameLen[i] == 0)
				newMax++;
			else if (SameLen[i] < newMax)
				newMax = SameLen[i];
			else if (SameLen[i] > newMax)
				newMax++;
			if (newMax > max)
				max = newMax;

		}

		return max;
	}

	public static int[] FindLen(String s) {
		int SameLen[] = new int[s.length()];
		for (int i = 0; i < SameLen.length; i++) {
			SameLen[i] = 0;
		}
		String tmp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ ";
		System.out.print(tmp.length());
		for (int i = 0; i < tmp.length(); i++) {
			char a = tmp.charAt(i);
			int k = 1;
			int first = 1;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == a && first == 1) {
					SameLen[j] = 0;
					k = 1;
					first = 0;
				} else {
					if (s.charAt(j) == a) {
						SameLen[j] = k;
						k = 1;
					} else {
						k++;
					}
				}	
			}
		}

		return SameLen;
	}
//
//	public static void main(String[] args) {
//
//		System.out.print(lengthOfLongestSubstring("asd"));
//
//	}

}