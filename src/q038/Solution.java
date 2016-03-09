package q038;

public class Solution {

	public String countAndSay(int n) {
		if (n < 1)
			return "1";
		String ans = "1";
		String tmp = "";
		n--;
		char now;
		int nowCount;
		while (n > 0) {
			now = ans.charAt(0);
			nowCount = 1;
			for (int i = 1; i < ans.length(); i++) {
				if (ans.charAt(i) == now)
					nowCount++;
				else {
					tmp += Integer.toString(nowCount)+now;
					now = ans.charAt(i);
					nowCount = 1;
				}

			}
			tmp +=  Integer.toString(nowCount)+now;
			ans = tmp;
			tmp = "";
			n--;
		}

		return ans;
	}

//	public static void main(String[] args) {
//		Solution s = new Solution();
//		for (int i = 1; i < 5; i++)
//			System.out.println(s.countAndSay(i));
//	}

}
