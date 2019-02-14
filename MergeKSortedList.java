
/*
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * 
 * Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6

Logic:  Divide and Conquer approach is discussed. 
This approach doesn’t require extra space for heap and works in O(nk Log k)

We already know that merging of two linked lists can be
 done in O(n) time and O(1) space (For arrays O(n) space 
 is required). 
 
 The idea is to pair up K lists and merge 
 each pair in linear time using O(1) space. 
 
 After first cycle, K/2 lists are left each of size 2*N.
  After second cycle, K/4 lists are left each of size 4*N and so on. 
 We repeat the procedure until we have only one list left.
 */
public class MergeKSortedList {

	// The main function that takes an array of lists
	// arr[0..last] and generates the sorted output
	public ListNode mergeKLists(ListNode[] lists) {
		// last element of array (last list in this case)
		int last = lists.length - 1;

		// repeat till only one list left
		while (last != 0) {
			int i = 0, j = last;

			while (i < j) {
				lists[i] = merge(lists[i], lists[j]);

				// increment
				i++;
				j--;

				// if all done update last
				if (i >= j) {
					last = j;
				}
			}
		}
		return lists[0];

	}

	/*
	 * Takes two lists sorted in increasing order, and merge their nodes together to
	 * make one big sorted list. Below function takes O(Log n) extra space for
	 * recursive calls, but it can be easily modified to work with same time and
	 * O(1) extra space
	 */
	public static ListNode merge(ListNode a, ListNode b) {
		ListNode result = null;
		if (a == null)
			return b;
		if (b == null)
			return a;

		// choose wither a or b
		if (a.val <= b.val) {
			result = a;
			result.next = merge(a.next, b);
		}

		else {
			result = b;
			result.next = merge(a, b.next);
		}
		return result;

	}

}
