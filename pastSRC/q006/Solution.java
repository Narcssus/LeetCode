package q006;

public class Solution {

	public String convert(String s, int numRows) {
		if(numRows<=1) return s;
		int k=0;
		int next=1;
		String[] lines=new String[numRows];
		String ans="";
	
		for(int i=0;i<numRows;i++){
			lines[i]="";
		}
		for(int i=0;i<s.length();i++){
			if(k==0) next=1;
			if(k==numRows-1) next=-1;
			lines[k]+=s.charAt(i);
			k+=next;
			
		}
		for(int i=0;i<numRows;i++){
			ans+=lines[i];
		}
		
		return ans;
		
		
	}

//	public static void main(String[] args) {
//		Solution s=new Solution();
//		
//		System.out.println(s.convert("ab", 1));
//	}

}
