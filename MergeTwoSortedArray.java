/**
 * Merge two sorted arrays without any additional space
 * 
 * shift everything in array 1
 * 
 * start at end of array
 * 
 * copy elements of array b at end of array 1 by comparing then
 * 
 * @author Arselan
 *
 */
public class MergeTwoSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) throws Exception {

		// if array a is not right length
		if (m + n > m)
			throw new Exception();

		// create pointers
		int nums1Index = m - 1;
		int nums2Index = n - 1;

		// merge index to keep tack in the A array
		int merge = m + n - 1;

		// compare two values of both array
		while (nums1Index >= 0 && nums2Index >= 0) {
			// we r going from greatest to smallest
			if (nums1[nums1Index] > nums2[nums2Index]) {
				nums1[merge] = nums1[nums1Index];
				nums1Index--;
			} else {
				// ib element of b is greater than a
				nums1[merge] = nums2[nums2Index];
				nums2Index--;
			}
			// decrement merge index
			merge--;
		}
		// copy rest of b elements if any left
		// just add them to a since they are already sorted
		while (nums2Index >= 0) {
			nums1[merge] = nums2[nums2Index];
			nums2Index--;
			merge--;
		}

	}

}
