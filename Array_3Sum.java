import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
 * 
 * Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
public class Array_3Sum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {

		// 3 pointers
		// get sum of two and compare it to third
		// if sum is too small increment pointer

		// list to store final results
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();

		// sort the array
		// because when we go through to try to find pair that sums up to that value
		// our algorithm only works if the list is sorted
		Arrays.sort(nums);

		// nums.length -3 because when the traverse is done
		// the start pointer is going to be the second to last and our end pointer is
		// going to be the last

		for (int i = 0; i <= nums.length - 3; i++) {
			// we are trying to be cautious of duplicates
			if (i == 0 || nums[i] > nums[i - 1]) {
				int start = i + 1;
				int end = nums.length - 1;

				// check for threesum
				while (start < end) {
					if (nums[i] + nums[start] + nums[end] == 0) {
						ArrayList<Integer> zeroes = new ArrayList<Integer>();
						zeroes.add(nums[i]);
						zeroes.add(nums[start]);
						zeroes.add(nums[end]);
						results.add(zeroes);
					}
					// we still need to increment the start or decrement the end
					if (nums[i] + nums[start] + nums[end] < 0) {
						// check for duplicates
						int currentstart = start;
						while (nums[start] == nums[currentstart] && start < end) {
							start++;
						}
					} else {
						// if duplicates (line 52==0)
						int currentend = end;
						while (nums[end] == nums[currentend] && start < end) {
							end--;
						}
					}
				}
			}

		}
		return results;
	}
}

/*
 * ArrayList<Integer> zeroNums=new ArrayList<Integer>();
 * ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>(); int
 * p=0; int q=0; int r=0; int tracker=0;
 * 
 * while(tracker<nums.length) { if(nums[p++]+nums[q++]==-nums[r++]) {
 * zeroNums.add(p); zeroNums.add(q); zeroNums.add(r); tracker++; } else {
 * p++;q++;r++;tracker++; }
 * 
 * } list.add(zeroNums);
 * 
 * return list;
 */

// }

// }
