import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Note: The algorithm should run in linear time and in O(1) space.

Example 1:

Input: [3,2,3]
Output: [3]
 */

public class Array_MajorityElement {
	public ArrayList<Integer> majorityElement(int[] nums) {
		ArrayList<Integer> list = new ArrayList();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			/*
			 * getOrDefault() Returns the value to which the specified key is mapped, or
			 * defaultValue if this map contains no mapping for the key.
			 */
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

		}
		for (Integer i : map.keySet()) {
			if (map.get(i) > (nums.length / 3)) {
				list.add(i);
			}
		}
		return list;

	}

}
