
/*
 * You are a professional robber planning to rob houses along a street. 
 * Each house has a certain amount of money stashed, the only constraint stopping you from 
 * robbing each of them is that adjacent houses have security system connected and it will
 *  automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
 */
public class HouseRobber {
	/*
	 * public int rob(int[] num) 
	 * { int last = 0; 
	 * int now = 0; 
	 * int tmp; 
	 * for (int n:num) 
	 * { 
	 * tmp = now; 
	 * now = Math.max(last + n, now); 
	 * last = tmp; 
	 * } 
	 * return now; 
	 * }
	 */

	public int rob(int[] nums) {

		// If we get invalid input, return 0
		if (nums == null || nums.length == 0)
			return 0;

		// Keep track of whether or not we robbed the previous house
		int robbedPrevious = 0;
		int didNotRobPrevious = 0;

		for (int i = 0; i < nums.length; i++) {

			// If we don't rob the current house, take the max of robbing and not robbing
			// the previous house
			int currentNotRobbed = Math.max(robbedPrevious, didNotRobPrevious);

			// If we rob the current house, add the current money robbed to what we got from
			// not robbing previous
			int currentIsRobbed = didNotRobPrevious + nums[i];

			// Update our values for the next iteration
			didNotRobPrevious = currentNotRobbed;
			robbedPrevious = currentIsRobbed;
		}

		// Return the maximum we could have robbed provided we looked at both options
		return Math.max(robbedPrevious, didNotRobPrevious);
	}

}
