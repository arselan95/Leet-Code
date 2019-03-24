import java.util.ArrayList;

/*
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1
 */
public class BST_KthSmallestElement {
	/*
	 * Basically do an inorder traversal and return the Kth element in the index
	 */

	public int kthSmallest(TreeNode root, int k) {

		if (root == null)
			return 0;

		ArrayList<Integer> list = new ArrayList<Integer>();

		inorderTraversal(root, list);

		return list.get(k-1);

	}

	private void inorderTraversal(TreeNode root, ArrayList<Integer> answer) {
		if (root == null) {
			return;
		}
		inorderTraversal(root.left, answer); // traverse left subtree
		answer.add(root.val); // visit the root
		inorderTraversal(root.right, answer); // traverse right subtree
	}

}
