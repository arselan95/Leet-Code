/*
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

Example 1:

Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class JumpGameArray_MinimumJumps {
	public boolean canJump(int[] nums) {

		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (pos < i)
				return false;

			// we need to use the local optimum solution, (nums[i] + i) shows the biggest
			// index we can get to.
			if (nums[i] + i > pos)
				pos = nums[i] + i;

		}
		return true;

	}
}
