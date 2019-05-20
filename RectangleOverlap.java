
/*
 * A rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) are the coordinates of its bottom-left corner, and (x2, y2) are the coordinates of its top-right corner.

Two rectangles overlap if the area of their intersection is positive.  To be clear, two rectangles that only touch at the corner or edges do not overlap.

Given two (axis-aligned) rectangles, return whether they overlap.

Example 1:

Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
Output: true
Example 2:

Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
Output: false
 */
/*
 * Before we do it in 2D plane, let's try it in 1D.
Given 2 segment (left1, right1), (left2, right2), how can we check whether they overlap?
If these two intervals overlap, it should exist an number x,

left1 < x < right1 && left2 < x < right2

left1 < x < right2 && left2 < x < right1

left1 < right2 && left2 < right1

This is the sufficient and necessary condition for two segments overlap.

Explanation:
For 2D, if two rectancle overlap both on x and y, they overlap in the plane.

Time Complexity:
O(1)
 */
public class RectangleOverlap {

	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		if (rec1[2] <= rec2[0] || // rec2 right
				rec2[2] <= rec1[0] || // rec2 left
				rec1[3] <= rec2[1] || // rec2 Top
				rec2[3] <= rec1[1]) // rec2 bottom
			return false;
		return true;

	}

}
