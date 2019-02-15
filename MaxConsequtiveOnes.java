
public class MaxConsequtiveOnes {
	/*
	 * Given a binary array, find the maximum number of consecutive 1s in this
	 * array.
	 * 
	 * 
	 */
	/*
	 * Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or the last
	 * three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
	 */

	public int findMaxConsecutiveOnes(int[] nums) {
		/*
		 * Any 1/0 string with at least one trailing 0 can be seeing as repeating of a
		 * pattern: a ones followed by 1 zero. We denote such a pattern by p(a)
		 */

		/*
		 * 0011011100 can be seen as p(0) + p(0) + p(2) + p(3) + p(0). count a pattern
		 * at its trailing 0.
		 */

		/*
		 * each occurrence of 0 signals the end of such a pattern.
		 * 
		 * patternEnds: the length of pattern that ends no later than i. length: the
		 * length of the run of 1 if i is in one.0 otherwise
		 */

		/*
		 * each index i: if nums[i] is 0: calculate the length till we see 0 that ends
		 * at nums[i]. Reset length because we are no longer in a run;
		 * 
		 * if nums[i] is 1: increment length which records run length, and try to update
		 * max with (length);
		 */

		int length = 0;
		int maxConsecutive = 0;

		for (int i = 0; i < nums.length; i++) {
			length++;
			if (nums[i] == 0) {
				length = 0;
			}
			maxConsecutive = Math.max(maxConsecutive, length);
		}
		return maxConsecutive;
	}

}
