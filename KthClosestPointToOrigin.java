import java.util.Arrays;

/*
 * We have a list of points on the plane.  Find the K closest points to the origin (0, 0).

(Here, the distance between two points on a plane is the Euclidean distance.)

You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)

 

Example 1:

Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation: 
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
Example 2:

Input: points = [[3,3],[5,-1],[-2,4]], K = 2
Output: [[3,3],[-2,4]]
(The answer [[-2,4],[3,3]] would also be accepted.)
 */

/*
 * The last solution is based on quick sort, we can also call it quick select. 

 * In the quick sort, we will always choose a pivot to compare with other elements. 
 
 * After one iteration, we will get an array that all elements smaller than the pivot 
 * are on the left side of the pivot and all elements greater than the pivot are on the right side of the 
 * pviot (assuming we sort the array in ascending order). So, inspired from this, each iteration,
 * we choose a pivot and then find the position p the pivot should be. Then we compare p with the K, 
 * if the p is smaller than the K, meaning the all element on the left of the pivot are all proper candidates 
 * but it is not adequate, we have to do the same thing on right side, and vice versa. If the p is exactly equal
 * to the K, meaning that we've found the K-th position. Therefore, we just return the first K elements, 
 * since they are not greater than the pivot.

Theoretically, the average time complexity is O(N) , 
but just like quick sort, in the worst case, this solution would be degenerated to O(N^2),
and pratically, the real time it takes on leetcode is 15ms.

The advantage of this solution is it is very efficient.
The disadvatage of this solution are it is neither an online solution nor a stable one. 
And the K elements closest are not sorted in ascending order.
 */

public class KthClosestPointToOrigin {

	public int[][] kClosestPointToOrigin(int[][] points, int k) {
		int low = 0;
		int high = points.length - 1;

		while (low <= high) {
			int[] pivot = points[high];
			int i = low;

			for (int j = low; j < high; j++) {
				if (distance(points[j]) < distance(pivot)) {
					swap(points, i, j);
					i++;
				}
			}

			swap(points, i, high);

			if (k < i) {
				high = i - 1;
			} else if (k > i) {
				low = i + 1;
			} else {
				break;
			}
		}

		return Arrays.copyOfRange(points, 0, k);
	}

	// we don't really nead sqrt here, since we are just comparing the distance
	private int distance(int[] p) {
		return p[0] * p[0] + p[1] * p[1];
	}

	private void swap(int[][] p, int i, int j) {
		int[] tmp = p[i];
		p[i] = p[j];
		p[j] = tmp;
	}

}
