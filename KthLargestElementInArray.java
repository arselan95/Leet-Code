import java.util.ArrayList;
import java.util.Arrays;

/*
 * Find the kth largest element in an unsorted array. 
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * 
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
	Output: 4
 */
public class KthLargestElementInArray {
	// [1,2,3,3,4,5,5,6]

	public int findKthLargest(int[] nums, int k) {

		// if array has only one element
		if (nums.length < 2) {
			return nums[0];
		}

		// sort O(nlog(n))
		Arrays.sort(nums);

		// get rid of duplicates
		// create a list because we are not sure whats the side of the array that we
		// need
		ArrayList<Integer> list = new ArrayList<Integer>();
		// compare each element of the array to that of next and add it to the list
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				list.add(nums[i]);
			}
		}
		// add last element of the array since we do not look at it in the loop (give
		// you out of bound)
		list.add(nums[nums.length - 1]);

		// debug test- printing to see if we got rid of all duplicates
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i));

		System.out.println("");

		// get the kth largest element
		// ex if aray size is 6 and we want 2nd largest then
		// 6-2=4; <- which means we need element in index 4
		int lar = (nums.length - k);
		System.out.println(lar);
		// edge case
		if (lar > nums.length) {
			return nums.length;
		}
		// get the kth largest value
		return nums[lar];

	}

}
