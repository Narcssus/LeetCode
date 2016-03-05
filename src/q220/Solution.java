package q220;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (nums.length < 1 || k < 1 || t < 0)
			return false;

		Map<Long, Long> myMap = new HashMap<Long, Long>();

		for (int i = 0; i < nums.length; i++) {
			long num = (long) nums[i] - Integer.MIN_VALUE;
			long buckets = num / ((long) t + 1);

			if (myMap.containsKey(buckets))
				return true;
			else if (myMap.containsKey(buckets - 1)
					&& num - myMap.get(buckets - 1) <= t)
				return true;
			else if (myMap.containsKey(buckets + 1)
					&& myMap.get(buckets + 1) - num <= t)
				return true;
			else {
				if (myMap.size() >= k) {
					long removebuckets = ((long) nums[i - k] - Integer.MIN_VALUE)
							/ ((long) t + 1);
					myMap.remove(removebuckets);
				}
			}
			myMap.put(buckets, num);
		}
		return false;
	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
