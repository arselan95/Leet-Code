/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) 
 * which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaximumSubarray {

	/*
	 * it starts at the left end (element A[1]) and scans through to the right end
	 * (element A[n]), keeping track of the maximum sum subvector seen so far. The
	 * maximum is initially A[0]. 
	 * 
	 * Suppose we've solved the problem for A[1 .. i -1]; 
	 * 
	 * how can we extend that to A[1 .. i]? 
	 * 
	 * The maximum sum in the first I
	 * elements is either the maximum sum in the first i - 1 elements (which we'll
	 * call MaxSoFar), or it is that of a subvector that ends in position i (which
	 * we'll call MaxEndingHere).
	 * 
	 * MaxEndingHere is either A[i] plus the previous MaxEndingHere, or just A[i],
	 * whichever is larger.
	 */

	public int maxSubArray(int[] nums) {

		int maxSoFar = nums[0], maxEndingHere = nums[0];
		for (int i = 1; i < nums.length; i++) {
			maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;

	}
}
