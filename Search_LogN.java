
/*
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
 */
public class Search_LogN {
	
	//binary search
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			// bug - 1 => filter out the special cases avoiding complex checkings;
			if (nums[m] == target)
				return m;
			// bug - 2 => trick to ensure an ordered half;
			if (nums[m] < nums[r]) {
				if (nums[m] < target && target <= nums[r])
					l = m + 1;
				else
					r = m - 1;
			} else if (nums[m] > nums[r]) {
				if (nums[l] <= target && target < nums[m])
					r = m - 1;
				else
					l = m + 1;
			} else
				return -1; // the last iteration since nums[m] == nums[r] => m == r since no duplicates;
		}
		return -1;
	}
}

/*
 * for(int i=0;i<nums.length;i++)
 * {
 * if(nums[i]==target)return i;
 * }
 * return -1;
 */
