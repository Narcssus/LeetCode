package q315;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	static class myNums {
		int number;
		int littleSum;
		int newnumber;

		myNums() {
			littleSum = 0;
		}
	}

	public List<Integer> countSmaller(int[] nums) {
		List<Integer> ans = new ArrayList<Integer>();
		myNums tmp[] = new myNums[nums.length];
		for (int i = 0; i < nums.length; i++) {
			tmp[i] = new myNums();
			tmp[i].number = i;
			tmp[i].newnumber = i;
		}

		mergesort(nums, 0, nums.length - 1, tmp);
		for (int i = 0; i < tmp.length; i++) {
			ans.add(tmp[i].littleSum);
		}

		return ans;

	}

	public int[] mergesort(int[] a, int first, int last, myNums[] number) {
		int mid = (first + last) / 2;
		if (first != last) {
			mergesort(a, first, mid, number);
			mergesort(a, mid + 1, last, number);
			merge(a, first, mid, last, number);
		}
		return a;
	}

	public void merge(int[] a, int first, int mid, int last, myNums[] number) {
		int[] tmp = new int[last - first + 1];
		int left = first;
		int right = mid + 1;
		int k = 0;

		while (left <= mid && right <= last) {
			if (a[left] < a[right])
				tmp[k++] = a[left++];
			else {
				tmp[k++] = a[right++];// ÄæÐò
				for (int i = k - 1; i < mid; i++) {
					number[i].littleSum++;
				}

			}

		}

		while (left <= mid) {// ÄæÐò
			tmp[k++] = a[left++];
			for (int i = k - 1; i <= mid; i++) {
				number[i].littleSum++;
			}
		}
		while (right <= last)
			tmp[k++] = a[right++];
		k--;
		while (k >= 0) {
			a[first + k] = tmp[k--];
		}

	}

//	public void main(String[] args) {
//		int a[] = { 5, 2, 6, 1 };
//		List<Integer> ans = countSmaller(a);
//		for (int i = 0; i < ans.size(); i++) {
//			System.out.println(ans.get(i));
//		}
//
//	}

}