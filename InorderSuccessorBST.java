
public class InorderSuccessorBST {

	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

		if (root == null) {

			return root;
		}
		TreeNode prev = null;
		TreeNode cur = root;
		while (cur != null) {
			if (cur.val <= p.val) {
				cur = cur.right;
			} else {
				prev = cur;
				cur = cur.left;
			}
		}
		return prev;

		/*
		 * 
		 * //if root is null return null if(root==null|| root.val==p.val) { return null;
		 * }
		 * 
		 * /* if(p.right!=null) { root.val=minval(root.right); return root; }
		 * 
		 * if(p.right!=null) { TreeNode s=p.right; while(s.left!=null){ TreeNode
		 * j=s.left;
		 * 
		 * return j; } } if(p.left!=null) { if(p.val>root.val) { TreeNode
		 * n=inorderSuccessor(root.right,p); n=root.right; return n;
		 * 
		 * } if(p.val<root.val) { TreeNode n1=inorderSuccessor(root.left,p);
		 * n1=root.left; return n1; } }
		 * 
		 * return root;
		 */
	}

}
