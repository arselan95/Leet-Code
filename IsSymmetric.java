

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
 * @author Arselan
 *
 */
public class IsSymmetric {
	public boolean isSymmetric(TreeNode root) {
		return root == null || help(root.left, root.right);

	}

	// two trees are mirror image of one another
	// true if
	
	// both trees are empty
	// OR
	
	// root node value of both trees are same
	// left sub tree should be mirror of right sub tree
	// right sub tree should be mirror of left sub tree
	public boolean help(TreeNode root, TreeNode root2) {
		if (root == null && root2 == null) {
			return true;
		}

		else if (root == null || root2 == null) {

			return false;
		}

		else if (root.val == root2.val) {
			// if left sub tree -root is mirror of right subtree-root2
			// right sub tree - root is mirrir of left sub tree- root 2
			if (help(root.left, root2.right) && help(root.right, root2.left)) {
				return true;
			}
		}
		return false;
	}

}
