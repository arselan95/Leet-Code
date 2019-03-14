package binarySearchTree;

import java.util.ArrayList;

/*
 * Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
Follow up: Recursive solution is trivial, could you do it iteratively?
 */

public class PreOrderTraverse {

	private void preorderTraversal(Node root, ArrayList<Integer> answer) {
		if (root == null) {
			return;
		}
		answer.add(root.val); // visit the root
		preorderTraversal(root.left, answer); // traverse left subtree
		preorderTraversal(root.right, answer); // traverse right subtree
	}

	public ArrayList<Integer> preorderTraversal(Node root) {
		ArrayList<Integer> answer = new ArrayList<>();
		preorderTraversal(root, answer);
		return answer;

	}

}
