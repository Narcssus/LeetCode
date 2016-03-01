package q303;

public class NumArray {
	public int[] Mynums;
	public NumArray(int[] nums) {
		Mynums=new int[nums.length];
		int tmp=0;
		for(int i=0;i<nums.length;i++){
			tmp=tmp+nums[i];
			Mynums[i]=tmp;
		}
	}

	public int sumRange(int i, int j) {
		if(i-1>=0) return  Mynums[j]-Mynums[i-1];
		return Mynums[j];
	}

//	public static void main(String[] args) {
//		int[] nums={1,2,3,4,5,6,7};
//		 NumArray numArray = new NumArray(nums);
//		 System.out.println(numArray.sumRange(0, 1));
//		 System.out.println(numArray.sumRange(1, 2));
//
//	}

}
