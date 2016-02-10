package Q324;

public class Solution {
	//Find the Kth smaller number
	public static int getK_MinNum(int[]nums,int p,int nowp,int right,int left){
		nowp=right;
		int tmp=nums[right];
		int [] newnums=new int[nums.length];
		int l=right;int h=left;
		for(int i=right+1;i<=left;i++){
			if(nums[i]<tmp){
				newnums[l++]=nums[i];
				nowp++;
			}
			else{
				newnums[h--]=nums[i];
			}
		}
		newnums[l]=tmp;
		if(nowp==p) return tmp;
		else if(nowp<p) return getK_MinNum(newnums,p,nowp,h+1,left);
		else return getK_MinNum(newnums,p, nowp,right,l-1);
		
	}
	
	public static void wiggleSort(int[] nums) {
		int len=nums.length;
		int mid;
		if(len%2==0) mid=(getK_MinNum(nums,len/2-1,0,0,len-1)+getK_MinNum(nums,len/2,0,0,len-1))/2;
		else mid=getK_MinNum(nums,len/2,0,0,len-1);
		int[] newnums=new int[len];
		
		 int i = 0, j = 0, k = len - 1;
		 int tmp;
		    while (j <= k) {
		        if (nums[(1+2*(j)) % (len|1)] > mid){
		        	tmp=nums[(1+2*(i++)) % (len|1)];
		        	nums[(1+2*(i++)) % (len|1)]=nums[(1+2*(j++)) % (len|1)];
		        	nums[(1+2*(j++)) % (len|1)]=tmp;
		        }
		        else if (nums[(1+2*(j)) % (len|1)] < mid){
		        	tmp=nums[(1+2*(j)) % (len|1)];
		        	nums[(1+2*(j)) % (len|1)]=nums[(1+2*(k--)) % (len|1)];
		        	nums[(1+2*(k--)) % (len|1)]=tmp;
		        }
		        else
		            j++;
		    }
//		
//		for(i=0;i<len;i++){
//			nums[i]=newnums[i];
//		}
		
	}

	public static void main(String[] args) {
		int [] nums={1, 3, 2, 2, 3, 1};
		wiggleSort(nums);
		for(int i=0;i<nums.length;i++)
		System.out.print(nums[i]+" ");

		
		
	}

}
