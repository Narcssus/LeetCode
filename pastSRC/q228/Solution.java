package q228;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static List<String> summaryRanges(int[] nums) {
		List<String> ans= new ArrayList<String>();
		if(nums.length<1) return ans;
		int begin=nums[0],end=nums[0];
		String tmp="";
		for(int i=1;i<nums.length;i++){
			if(nums[i]==end+1) end=nums[i];
			else{
				if(begin!=end){
					tmp=begin+"->"+end;
					ans.add(tmp);
				}
				else{
					ans.add(begin+"");
				}
				begin=nums[i];
				end=nums[i];
			}
		}
		if(begin!=end){
			tmp=begin+"->"+end;
			ans.add(tmp);
		}
		else{
			ans.add(begin+"");
		}
		
		
		return ans;
	}

//	public static void main(String[] args) {
//		int[] a={1,4,5,6,7,9};
//		System.out.print(summaryRanges(a).toString());
//
//	}

}
