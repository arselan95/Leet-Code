package hackerRank;

/*
 * Alice is a kindergarten teacher. She wants to give some candies to the children in her class.  
 * All the children sit in a line and each of them has a rating score according to his or her performance in the class.  
 * Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher 
 * rating must get more candies. Alice wants to minimize the total number of candies she must buy.

For example, assume her students' ratings are [4, 6, 4, 5, 6, 2]. 
She gives the students candy in the following minimal amounts: [1, 2, 1, 2, 3, 1]. She must buy a minimum of 10 candies.
 */
public class Candies_Teacher_OneTwoNeighbor {

	/*
	 * We can always assign a neighbor with 1 more if the neighbor has higher a
	 * rating value. However, to get the minimum total number, we should always
	 * start adding 1s in the ascending order.
	 * 
	 * We can solve this problem by scanning the array from both sides. First, scan
	 * the array from left to right, and assign values for all the ascending pairs.
	 * Then scan from right to left and assign values to descending pairs.
	 */

	// Complete the candies function below.
	static long candies(int n, int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		int[] candies = new int[arr.length];
		candies[0] = 1;

		// from let to right
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				candies[i] = candies[i - 1] + 1;
			} else {
				// if not ascending, assign 1
				candies[i] = 1;
			}
		}

		long result = candies[arr.length - 1];

		// from right to left
		for (int i = arr.length - 2; i >= 0; i--) {
			int cur = 1;
			if (arr[i] > arr[i + 1]) {
				cur = candies[i + 1] + 1;
			}

			result += Math.max(cur, candies[i]);
			candies[i] = cur;
		}

		return result;

	}

}
