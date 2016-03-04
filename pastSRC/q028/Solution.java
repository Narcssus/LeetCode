package q028;

public class Solution {

	public static void getNext(String a, int[] next) {
		int q,k;
	    int m = a.length();
	    next[0] = 0;
	    for (q = 1,k = 0; q < m; ++q)
	    {
	        while(k > 0 && a.charAt(q) != a.charAt(k))
	            k = next[k-1];
	        if (a.charAt(q) == a.charAt(k))
	        {
	            k++;
	        }
	        next[q] = k;
	    }
		
	}

	public static int strStr(String haystack, String needle) {
		if (needle.length() > haystack.length())
			return -1;
		if (needle.length() < 1 || haystack.length() < 1)
			return 0;
		int next[] = new int[needle.length()];
		getNext(needle, next);
		int q=0;
		for (int i = 0; i < haystack.length(); i++) {
			while(q > 0 && needle.charAt(q) != haystack.charAt(i))
	            q = next[q-1];
	        if (needle.charAt(q) == haystack.charAt(i))
	        {
	            q++;
	        }
	        if (q == needle.length())
	        {
	        	return i-needle.length()+1;
	        }

		}
		return -1;
	}

//	public static void main(String[] args) {
//		String a = "mississippi";
//		String b = "issip";
//
//		System.out.println(a.indexOf(b));
//		System.out.println(strStr(a, b));
//
//	}

}
