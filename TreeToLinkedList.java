
/*
 * convert tree to linkedlist
 * 
 * it always has to be doubly linked list
 */
public class TreeToLinkedList {

	public TreeNode merge(TreeNode a, TreeNode b) {
		if (a == null)
			return b;
		if (b == null)
			return a;

		// merge end of first list to begigning of send list and vice versa
		// point end of 2nd list to begigning of first

		// so we gonna have pointers at the end of both

		TreeNode aEnd = a.left;
		TreeNode bEnd = b.left;

		// merge start of a to end of b
		a.left = bEnd;
		// merge end of b to start of a
		bEnd.right = a;

		// merge end of a to start of b
		aEnd.right = b;
		// merge start of b to end of a
		b.left = aEnd;

		return a;
	}

	// start from top , recursively go down to subtree and generate list from that
	// sub tree
	// and then we merge those lists together

	// left+mid+right sub tree

	public TreeNode treeToList(TreeNode n) {
		if (n == null)
			return n;
		TreeNode leftlist = treeToList(n.left);
		TreeNode rightlist = treeToList(n.right);
		n.left = n;
		n.right = n;

		n = merge(leftlist, n);
		n = merge(n, rightlist);
		return n;

	}

}
