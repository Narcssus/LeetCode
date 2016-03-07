package q331;

import java.util.Stack;

public class Solution {

	public boolean isValidSerialization(String preorder) {
		Stack<String> s = new Stack<String>();
		if (preorder.length() <= 1 && !preorder.equals("#"))
			return false;
		if (preorder.charAt(0) == '#' && preorder.length() > 1)
			return false;
		String b;

		String[] str = preorder.split(",");
		s.push(str[0]);

		for (int i = 1; i < str.length; i++) {
			b = str[i];
			while (s.peek().equals("#") && b.equals("#")) {
				s.pop();
				if (s.isEmpty()) {
					if (i != str.length - 1)
						return false;
					break;
				}
				if (!s.peek().equals("#")) {
					s.pop();
					if (s.isEmpty()) {
						if (i != str.length - 1)
							return false;
						break;
					}

					b = s.peek();
					s.push("#");
				}
			}
			if (b.equals(str[i]))
				s.push(b);
		}

		while (!s.isEmpty() && s.peek().equals("#"))
			s.pop();
		return s.isEmpty();
	}

//	public static void main(String[] args) {
//		Solution s = new Solution();
//		// System.out.println(s.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
//		// System.out.println(s.isValidSerialization("9,#,#,1"));
//		System.out.println(s.isValidSerialization("9,#,92,#,#"));
//	}

}
