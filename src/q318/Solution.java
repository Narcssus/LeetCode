package q318;

public class Solution {
	public int maxProduct(String[] words) {
		if(words.length<1) return 0;
		int[] marks =new int[words.length];
		char a;
		for(int i=0;i<words.length;i++){
			for(int j=0;j<words[i].length();j++){
				a=words[i].charAt(j);
				marks[i]=marks[i]|(1<<(a-'a'));
			}
		}
		
		int max=0;
		for(int i=0;i<words.length;i++){
			for(int j=i;j<words.length;j++){
				if((marks[i]&marks[j])!=0) continue;
				else{
					max=Math.max(max, words[i].length()*words[j].length());
				}
			}
		}
		return max;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
