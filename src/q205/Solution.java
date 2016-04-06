package q205;

import java.util.Hashtable;

public class Solution {
	public boolean isIsomorphic(String s, String t) {
		Hashtable<Character, Character> h1 = new Hashtable<Character, Character>();
		Hashtable<Character, Character> h2 = new Hashtable<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if (!h1.containsKey(c1) && !h2.containsKey(c2)) {
				h1.put(c1, c2);
				h2.put(c2, c1);
			} else {
				if (h1.containsKey(c1) && h1.get(c1) != c2)
					return false;
				if (h2.containsKey(c2) && h2.get(c2) != c1)
					return false;
			}
		}
		return true;
	}

}
