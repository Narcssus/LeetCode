package q202;

public class Solution {

	public boolean isHappy(int n) {
		String tmp = n + "";
		while (n != 4) {
			tmp = n + "";
			n = 0;
			for (int j = 0; j < tmp.length(); j++) {
				n += (tmp.charAt(j) - '0') * (tmp.charAt(j) - '0');
			}
			if (n == 1)
				return true;
		}
		return false;
	}

	// public static void main(String[] args) {
	// Solution s=new Solution();
	// for(int i=1;i<Integer.MAX_VALUE;i++){
	// System.out.println(i+" "+s.isHappy(i));
	// }
	//
	// }

}
