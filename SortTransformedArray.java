import java.util.PriorityQueue;

/*
 * Given a sorted array of integers nums and integer values a, b and c. Apply a quadratic function of the form f(x) = ax2 + bx + c to each element x in the array.

The returned array must be in sorted order.

Expected time complexity: O(n)

Input: nums = [-4,-2,2,4], a = 1, b = 3, c = 5
Output: [3,9,15,33]
 */
public class SortTransformedArray {

	public int[] sortTransformedArray(int[] nums, int a, int b, int c) {

		// do the math
		int x = 0;
		// Priority queue insertion is constant so its still O(n)
		// it would sort element based on the priority
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		// do math and add element to the queue
		for (int i = 0; i < nums.length; i++) {
			x = a * (nums[i] * nums[i]) + b * nums[i] + c;
			System.out.print(x + " ");
			queue.add(x);

		}

		// debugging
		System.out.println(" ");
		System.out.println(queue.size());

		/*
		 * for(int i=0;i<queue.size();i++){ while(!queue.isEmpty())
		 * System.out.print(queue.poll()+" ,"); }
		 */

		// create temp array of same size as queue or we can also use the same array
		int[] temp = new int[queue.size()];

		// add elements from queue to array and return the array
		int i = 0;
		while (!queue.isEmpty()) {
			temp[i] = queue.poll();
			i++;
		}
		return temp;

	}

}
