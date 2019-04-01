package hackerRank;

/*
 * Given an array of integers, find the subset of non-adjacent elements with the maximum sum. Calculate the sum of that subset.

For example, given an array arr=[-2,1,3,-4,5]  we have the following possible subsets:

Subset      Sum
[-2, 3, 5]   6
[-2, 3]      1
[-2, -4]    -6
[-2, 5]      3
[1, -4]     -3
[1, 5]       6
[3, 5]       8
Our maximum subset sum is 8
 */

/*
 * arr[] = {5,  5, 10, 40, 50, 35}

  incl = 5 
  excl = 0

  For i = 1 (current element is 5)
  incl =  (excl + arr[i])  = 5
  excl =  max(5, 0) = 5

  For i = 2 (current element is 10)
  incl =  (excl + arr[i]) = 15
  excl =  max(5, 5) = 5

  For i = 3 (current element is 40)
  incl = (excl + arr[i]) = 45
  excl = max(5, 15) = 15

  For i = 4 (current element is 50)
  incl = (excl + arr[i]) = 65
  excl =  max(45, 15) = 45

  For i = 5 (current element is 35)
  incl =  (excl + arr[i]) = 80
  excl =  max(65, 45) = 65

And 35 is the last element. So, answer is max(incl, excl) =  80
 */
public class MaxArraySum_Subset_NonAdjacent {
	/*
	 * Loop for all elements in arr[] and maintain two sums incl and excl where incl
	 * = Max sum including the previous element and excl = Max sum excluding the
	 * previous element.
	 * 
	 * Max sum excluding the current element will be max(incl, excl) and max sum
	 * including the current element will be excl + current element (Note that only
	 * excl is considered because elements cannot be adjacent).
	 * 
	 * At the end of the loop return max of incl and excl.
	 */
	static int maxSubsetSum(int[] arr) {

		int sum1 = arr[0];
		int sum2 = 0;
		int updateSum2;

		for (int i = 1; i < arr.length; i++) {
			/// * current max excluding i */
			updateSum2 = (sum1 > sum2) ? sum1 : sum2;

			/* current max including i */
			sum1 = sum2 + arr[i];
			sum2 = updateSum2;
		}
		/* return max of incl and excl */
		return ((sum1 > sum2) ? sum1 : sum2);

	}

}
