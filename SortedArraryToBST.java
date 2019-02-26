/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
 * @author Arselan
 *
 */
public class SortedArraryToBST {

	public TreeNode sortedarrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		TreeNode root = insert(nums, 0, nums.length - 1);
		return root;
	}

	// a merge sort approach
	// since array is sorted
	// values greater than mid ar to the right
	// values less than mid are to the left
	public TreeNode insert(int[] num, int low, int high) {
		if (low > high) { // Done
			return null;
		}
		// get mid
		int mid = (low + high) / 2;
		// new node with mid
		TreeNode node = new TreeNode(num[mid]);
		// low vals to left tree , high vals to right tree
		node.left = insert(num, low, mid - 1);
		node.right = insert(num, mid + 1, high);
		return node;
	}

}
