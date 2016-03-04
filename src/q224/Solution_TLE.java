package q224;

public class Solution_TLE {


	public static int calculate(String s) {
		if(s.length()<1) return 0;
		int ans = 0;
		String tmp = "";
		String newtmp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '+') {
				ans = ans + Integer.parseInt(tmp);
				tmp = "";
			} else if (s.charAt(i) == '-') {
				ans = ans - Integer.parseInt(tmp);
				tmp = "";
			} else if (s.charAt(i) == ' ') {
				continue;
			} else if (s.charAt(i) == ')') {
				int mark = 1;
				i--;
				while (i >= 0 && mark != 0) {
					if (s.charAt(i) == ')')
						mark++;
					if (s.charAt(i) == '(')
						mark--;
					newtmp = s.charAt(i) + newtmp;
					i--;
				}
				if(tmp=="") tmp=calculate(newtmp.substring(1))+"";
				i++;
				newtmp="";
			} else if (s.charAt(i) == '(') {
				continue;
			} else {
				tmp = s.charAt(i) + tmp;
			}
		}

		if (tmp.length() > 0)
			ans = ans + Integer.parseInt(tmp);
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
	}

}
