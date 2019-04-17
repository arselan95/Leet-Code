import java.util.HashMap;

/*
 * Given an array of integers and an integer k, 
 * you need to find the number of unique k-diff pairs in the array. 
 * Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers 
 * in the array and their absolute difference is k.

Example 1:
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
 */
public class KDifference_ARRAY_TwoDiff {
	public int findPairs(int[] nums, int k) {
		// HashMap<Element, Frequency>
		if (nums == null || nums.length == 0 || k < 0)
			return 0;

		// 1. Iterate on the map to avoid duplicate: [1,1,3,4,5] ->map: 1,3,4,5
		// 2. Only count (element+k) to avoud duplicate: (1, 2) k = 1; only calculate 1
		// + 1 = 2, never calculate 2 - 1 = 1;
		int res = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int n : nums)
			map.put(n, map.getOrDefault(n, 0) + 1);
		for (int key : map.keySet()) {
			if (k == 0) {
				if (map.get(key) >= 2)
					res++;
			} else {
				if (map.containsKey(key + k))
					res++;

			}
		}
		return res;
	}

}
