package q1;
import java.util.Arrays;
import java.util.Hashtable;
public class Solution {
	public static int getMax(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++)
			max = Math.max(max, nums[i]);
		return max;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static int[] twoSum(int[] nums, int target) {
		int[] ans = { 0, 0 };
		Hashtable index1 = new Hashtable();
		Hashtable index2 = new Hashtable();
		for (int i = 0; i < nums.length; i++) {
			if (index1.containsKey(nums[i]) && !index2.containsKey(nums[i])) {
				index2.put(nums[i], i + 1);
			} else if (!index1.containsKey(nums[i]))
				index1.put(nums[i], i + 1);
		}
		int tmp = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				tmp = nums[i] + nums[j];
				if (tmp > target)
					break;
				else if (tmp == target) {
					if (nums[i] == nums[j]) {
						ans[0] = Integer.parseInt(index1.get(nums[i])
								.toString());
						ans[1] = Integer.parseInt(index2.get(nums[j])
								.toString());
					} else {
						ans[0] = Integer.parseInt(index1.get(nums[i])
								.toString());
						ans[1] = Integer.parseInt(index1.get(nums[j])
								.toString());
					}
					Arrays.sort(ans);
					return ans;
				}
			}
			if (nums[i] > target)
				break;
		}
		return ans;
	}
	// public static void main(String[] args) {
	// int a[]={-1,-2,-3,-4,-5};
	// int t=-8;
	// int[] ans=twoSum(a, t);
	// System.out.print(ans[0]+" "+ans[1]);
	//
	// }
}
