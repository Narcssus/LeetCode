package q165;

public class Solution {

	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("[.]");
		String[] v2 = version2.split("[.]");
		int i = 0;
		while (i < v1.length && i < v2.length) {
			if (Integer.valueOf(v1[i]) < Integer.valueOf(v2[i]))
				return -1;
			else if (Integer.valueOf(v1[i]) > Integer.valueOf(v2[i]))
				return 1;
			i++;
		}
		while (i < v1.length) {
			if (Integer.valueOf(v1[i]) > 0)
				return 1;
			i++;
		}
		while (i < v2.length) {
			if (Integer.valueOf(v2[i]) > 0)
				return -1;
			i++;
		}

		return 0;

	}

//	public static void main(String[] args) {
//
//		Solution s = new Solution();
//		System.out.print(s.compareVersion("1.1", "1.2.1"));
//	}

}
