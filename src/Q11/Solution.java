package Q11;

public class Solution {

	public static int maxArea(int[] height) {
		int ans=0;
		if(height.length<2) return ans;
		int right=height.length-1;
		int left=0;
		int tmpArea;
		while(left<right){
			tmpArea=(right-left)*Math.min(height[left], height[right]);
			ans=Math.max(ans, tmpArea);
			if(height[left]<height[right]){
				left++;
			}
			else{
				right--;
			}
		}
		return ans;
	}
//
//	public static void main(String[] args) {
//		int[] a={2,4,3};
//		System.out.print(maxArea(a));
//	}

}
