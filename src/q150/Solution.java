package q150;

import java.util.Stack;

public class Solution {

	public static int evalRPN(String[] tokens) {
		if (tokens.length < 1)
			return 0;
		int ans = 0;
		Stack<String> num = new Stack<String>();
		for (int i = 0; i < tokens.length; i++) {
			if (!tokens[i].equals("+") && !tokens[i].equals("-")
					&& !tokens[i].equals("*") && !tokens[i].equals("/")) {
				num.push(tokens[i]);
			} else {
				int a = Integer.parseInt(num.pop());
				int b = Integer.parseInt(num.pop());
				char theOp = tokens[i].charAt(0);
				switch (theOp) {
				case '+':
					ans = a + b;
					num.push(ans + "");
					break;
				case '-':
					ans = b - a;
					num.push(ans + "");
					break;
				case '*':
					ans = a * b;
					num.push(ans + "");
					break;
				case '/':
					ans = b / a;
					num.push(ans + "");
					break;
				default:
					break;
				}
			}
		}

		return Integer.parseInt(num.pop());

	}
//
//	public static void main(String[] args) {
//		String[] a = { "2", "1", "+", "3", "*" };
//		System.out.print(evalRPN(a));
//	}

}
