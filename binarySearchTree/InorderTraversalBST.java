import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversalBST {
	// recursive stack
	// iterative stack

	// as we go down we can push element on stack
	// LIFO

	public static ArrayList<Integer> traverse(TreeNode root) {

		ArrayList<Integer> answer = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();

		if (root == null)
			return answer;

		TreeNode cur = root;
		while (cur != null || !s.isEmpty()) {
			while (cur != null) {
				s.push(cur);
				cur = cur.left;
			}
			cur = s.pop();
			answer.add(cur.val);
			cur = cur.right;
		}
		return answer;
	}
}
