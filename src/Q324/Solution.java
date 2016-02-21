package Q324;

import java.util.Arrays;

public class Solution {
//	//Find the Kth smaller number
//	public static int getK_MinNum(int[]nums,int p,int nowp,int right,int left){
//		nowp=right;
//		int tmp=nums[right];
//		int [] newnums=new int[nums.length];
//		int l=right;int h=left;
//		for(int i=right+1;i<=left;i++){
//			if(nums[i]<tmp){
//				newnums[l++]=nums[i];
//				nowp++;
//			}
//			else{
//				newnums[h--]=nums[i];
//			}
//		}
//		newnums[l]=tmp;
//		if(nowp==p) return tmp;
//		else if(nowp<p) return getK_MinNum(newnums,p,nowp,h+1,left);
//		else return getK_MinNum(newnums,p, nowp,right,l-1);
//		
//	}
	
	public static void wiggleSort(int[] nums) {
		int len=nums.length;
		int [] newnums= new int[len];
		int i,j,tmp;
		Arrays.sort(nums);
		for(i=0;i<(len-1)/2+1;i++){
			tmp=nums[i];
			nums[i]=nums[len-1-i];
			nums[len-1-i]=tmp;
		}
		i=0;
		while(2*i+1<len){
			 newnums[2*i+1]=nums[i];
			 i++;
		}
		j=i;
		while(j<len&&2*(j-i)<len){
			newnums[2*(j-i)]=nums[j];
			j++;
		}
		for(i=0;i<nums.length;i++) nums[i]=newnums[i];
		
	}

//	public static void main(String[] args) {
//		int [] nums={1,2,3,4,5,6,7};
//		wiggleSort(nums);
//		for(int i=0;i<nums.length;i++)	System.out.print(nums[i]+" ");
//
//		
//		
//	}

}
