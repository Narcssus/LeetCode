package q131;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<String>> partition(String s) {
		List<List<String>> ans = new ArrayList<List<String>>();
		List<String> now = new ArrayList<String>();
		helper(s, now, ans);
		return ans;
	}

	public void helper(String s, List<String> now, List<List<String>> ans) {
		if (s.length() == 0) {
			ans.add(new ArrayList<String>(now));
		}
		String tmp;
		for (int i = 0; i <= s.length(); i++) {
			tmp = s.substring(0, i);
			if (isPalindrome(tmp)) {
				now.add(tmp);
				helper(s.substring(i), now, ans);
				now.remove(now.size() - 1);
			}
		}

	}

	public boolean isPalindrome(String s) {
		if(s.length()<1) return false;
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

//	public static void main(String[] args) {
//		Solution s = new Solution();
//		System.out.print(s.partition("abaaaaaaaaa").toString());
//
//	}

}
