
public class Longest_Increasing_SubsequenceArray {
	/*
	 * dp[i] represents the the length of the LIS till nums[i].
	 * 
	 * For each nums[i], we need to compare all the nums[j] where 0 <= j < i, if
	 * nums[i] > nums[j], then dp[i] = dp[j] + 1, that means we have found a
	 * potential LIS.
	 * 
	 * Let i go through the nums[] array, eventually we will get the longest length
	 * of LIS.
	 * 
	 * Time complexity is O(n^2).
	 */

	public int lengthOfLIS(int[] nums) {
		if (nums.length == 0)
			return 0;

		int n = nums.length, max = 0;
		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			dp[i] = 1;

			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
					dp[i] = dp[j] + 1;
				}
			}

			max = Math.max(max, dp[i]);
		}

		return max;
	}

	/*
	 * BINARY SEARCH O(n log n) In fact, this is a variant of the insert sort
	 * algorithm, we use binary search to find the insert point. The dp array is
	 * used to store the elements of the Longest Increasing Subsequence, of course,
	 * you can also use ArrayList to do the same job.
	 */
	public static int findPositionToReplace(int[] a, int low, int high, int x) {
		int mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (a[mid] == x)
				return mid;
			else if (a[mid] > x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	public static int lengthOfLIS1(int[] nums) {
		if (nums == null | nums.length == 0)
			return 0;
		int n = nums.length, len = 0;
		int[] increasingSequence = new int[n];
		increasingSequence[len++] = nums[0];
		for (int i = 1; i < n; i++) {
			if (nums[i] > increasingSequence[len - 1])
				increasingSequence[len++] = nums[i];
			else {
				int position = findPositionToReplace(increasingSequence, 0, len - 1, nums[i]);
				increasingSequence[position] = nums[i];
			}
		}
		return len;
	}

}
