/*
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the 
index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, 
you should return the left-most pivot index.

Example 1:

Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.
 

Example 2:

Input: 
nums = [1, 2, 3]
Output: -1
Explanation: 
There is no index that satisfies the conditions in the problem statement.
 */
public class TwoEqualDivideSum_Array_Pivot {

	/*
	 * prefixSum * 2 == sum - nums[i] rather than prefixSum = (sum - nums[i])/2;?
	This is because the odd/even of a number, for example: [2 1 2 1], 
	it should return -1, we can get sum = 6, when it goes to i = 1, prefixSum = 2, and (sum - nums[i])/2 = 5/2 = 2,
 	we may get the wrong answer, that's the reason why we use multiply 2.
	 */
	public int pivotIndex(int[] nums) {
		int sum = 0;
		for (int num : nums)
			sum += num;

		int prefixSum = 0; // prefix sum to the left of index i
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (prefixSum * 2 == sum - nums[i])
				return i;
			prefixSum += nums[i];
		}

		return -1;

	}

}
