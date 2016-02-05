package Q179;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	
	
	
	public static String largestNumber(int[] nums) {
		if(nums.length<1)return "0";
		String ans="";
		String[] strNums=new String[nums.length];
		for(int i=0;i<nums.length;i++){
			strNums[i]=nums[i]+"";
		}
		Comparator<String> mycomp = new Comparator<String>(){
	        public int compare(String a, String b){
	            String s1 = a+b;
	            String s2 = b+a;
	            return s1.compareTo(s2);
	        }
	    };
		Arrays.sort(strNums,mycomp);
		
		for(int i=strNums.length-1;i>=0;i--){
			ans+=strNums[i];
		}
		if(ans.charAt(0)=='0')	return "0";
		
		
		return ans;
	}

//	public static void main(String[] args) {
//		int[] a={3, 30, 34, 5, 9};
//		String b=largestNumber(a);
//		System.out.println(b);
//	}

}
