import java.util.Stack;

public class InorderTraversalBST {
	// recursive stack
	// iterative stack

	// as we go down we can push element on stack
	// LIFO

	public static void traverse(TreeNode n) {
		Stack<TreeNode> st = new Stack<TreeNode>();
		while (!st.isEmpty()) {
			TreeNode temp = st.pop();
			// add to list
			if (temp.right != null) {
				addToStack(st, temp.right);
			}
		}
	}

	public static void addToStack(Stack<TreeNode> s, TreeNode n)

	{
		while (n != null) {
			s.push(n);
			n = n.left;
		}
	}
}
