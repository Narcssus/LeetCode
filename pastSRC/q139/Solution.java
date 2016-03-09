package q139;

import java.util.Set;

public class Solution {

	public boolean wordBreak(String s, Set<String> wordDict) {

		boolean[] mark=new boolean[s.length()+1];
		mark[0]=true;
		for(int i=1;i<=s.length();i++){
			for(int j=0;j<i;j++){
				if(mark[j]&&wordDict.contains(s.substring(j,i))){
					mark[i]=true;
					break;
				}
			}
		}
		
		
		return mark[s.length()];
	}
//
//	public static void main(String[] args) {
//		Solution s = new Solution();
//	}

}
