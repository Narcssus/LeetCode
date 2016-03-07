package q067;

public class Solution {

	public String addBinary(String a, String b) {
		String ans = "";
		int i = a.length() - 1;
		int j = b.length() - 1;
		boolean add = false;
		boolean p, q;
		int tmp = 0;
		while (i >= 0 && j >= 0) {
			tmp=0;
			p = a.charAt(i) - '0' == 1;
			q = b.charAt(j) - '0' == 1;
			if (p & !q & !add | !p & q & !add | !p & !q & add | p & q & add)
				tmp = 1;
			add = p & q & !add | p & !q & add | !p & q & add | p & q & add;
			ans = tmp + ans;
			i--;
			j--;
		}
		while (i >= 0) {
			p = a.charAt(i) - '0' == 1;
			tmp=0;
			if (p & !add | !p & add)
				tmp = 1;
			add = p & add;
			ans = tmp + ans;
			i--;
		}
		while (j >= 0) {
			p = b.charAt(j) - '0' == 1;
			tmp=0;
			if (p & !add | !p & add)
				tmp = 1;
			add = p & add;
			ans = tmp + ans;
			j--;
		}
		if(add) ans=1+ans;
		return ans;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String a = "1010";
		String b = "1011";
		System.out.print(s.addBinary(a, b));

	}

}
