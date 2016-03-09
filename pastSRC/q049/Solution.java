package q049;

import java.util.*;

public class Solution {

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> ans = new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		if (strs.length < 1)
			return null;

		Arrays.sort(strs);
		String s = "";
		for (int i = 0; i < strs.length; i++) {
			s = strs[i];
			String key = helper(s);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(s);

		}

		ans = new ArrayList<List<String>>(map.values());

		return ans;
	}

	public String helper(String s) {
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return String.valueOf(a);
	}
	//
	// public static void main(String[] args) {
	// Solution s = new Solution();
	// String[] a = { "asd" };
	// s.groupAnagrams(a);
	// }

}
