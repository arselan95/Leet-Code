
/*
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children. O(N)
 */

/*
 * (a) Get the max depth of left subtree recursively  i.e., 
          call maxDepth( tree->left-subtree)
     (a) Get the max depth of right subtree recursively  i.e., 
          call maxDepth( tree->right-subtree)
     (c) Get the max of max depths of left and right 
          subtrees and add 1 to it for the current node.
         max_depth = max(max dept of left subtree,  
                             max depth of right subtree) 
                             + 1
 */
public class DepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		int h = 0;
		if (root == null) {
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		/*
		 * add 1 to it for the current node. max_depth = max(max dept of left subtree,
		 * max depth of right subtree) + 1
		 */
		if (left > right) {
			h = 1 + left;
		} else {
			h = 1 + right;
		}
		return h;

	}

}
