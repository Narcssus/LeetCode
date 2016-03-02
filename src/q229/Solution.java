package q229;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> ans=new ArrayList<Integer>();
		if(nums.length<1) return ans;
		int a=0,b=0;
		int atime=0,btime=0;
		
		for(int i=0;i<nums.length;i++){			
			if(nums[i]==a) atime++;
			else if(nums[i]==b) btime++;
			else if(atime==0){
				a=nums[i];
				atime=1;
			}
			else if(btime==0){
				b=nums[i];
				btime=1;
			}
			else{
				atime--;
				btime--;
			}
		}
		atime=0;
		btime=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==a) atime++;
			else if(nums[i]==b) btime++;
		}
		
		if(atime>nums.length/3) ans.add(a);
		if(btime>nums.length/3) ans.add(b);
		
		return ans;
    } 
//	public static void main(String[] args) {
//		int[] a={1,2};
//		System.out.print(majorityElement(a).toString());
//	}

}
