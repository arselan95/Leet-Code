
/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 */
public class IsValidBST {

	public boolean isValidBST(TreeNode root) {
		// since there is no min or max we use int.max or long
		return help(root, Long.MIN_VALUE, Long.MAX_VALUE);

	}

	public boolean help(TreeNode n, long min, long max) {
		// if null then empty tree which is true
		if (n == null)
			return true;
		// check if our value is between min and max range
		if (n.val <= min || n.val >= max)
			return false;
		// call it on two children
		// since max is n.val which means as long as its not greather than that max
		// same with right side
		//
		return help(n.left, min, n.val) && help(n.right, n.val, max);

	}

}
