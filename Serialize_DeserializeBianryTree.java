import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/*
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. 
There is no restriction on how your serialization/deserialization algorithm should work. 
You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized 
to the original tree structure.

Example: 

You may serialize the following tree:

    1
   / \
  2   3
     / \
    4   5

as "[1,2,3,null,null,4,5]"
 */
public class Serialize_DeserializeBianryTree {

	/*
	 * print the tree in pre-order traversal and use "X" to denote null node and
	 * split node with ",". We can use a StringBuilder for building the string on
	 * the fly.
	 * 
	 * For deserializing, we use a Queue to store the pre-order traversal and since
	 * we have "X" as null node, we know exactly how to where to end building
	 * subtress.
	 */

	/*
	 * When you do "A" + "B", Java uses StringBuilder too.
	 * 
	 * The difference is that when doing recursion without StringBuilder, each time
	 * java creates new StringBuilder. If you pass the StringBuilder into the
	 * function, you just need to create ONE StringBuilder, which is more efficient.
	 */

	private static final String spliter = ",";
	private static final String NN = "X";

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		buildString(root, sb);
		return sb.toString();
	}

	private void buildString(TreeNode node, StringBuilder sb) {
		if (node == null) {
			sb.append(NN).append(spliter);
		} else {
			sb.append(node.val).append(spliter);
			buildString(node.left, sb);
			buildString(node.right, sb);
		}
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {

		/*
		 * A deque, also known as a double-ended queue, is an ordered collection of
		 * items similar to the queue. It has two ends, a front and a rear, and the
		 * items remain positioned in the collection. ... In a sense, this hybrid linear
		 * structure provides all the capabilities of stacks and queues in a single data
		 * structure.
		 */
		/*
		 * One example where a deque can be used is the A-Steal job scheduling
		 * algorithm. This algorithm implements task scheduling for several processors.
		 * A separate deque with threads to be executed is maintained for each
		 * processor.
		 */
		
		//can also use an split array
		Deque<String> nodes = new LinkedList<>();
		nodes.addAll(Arrays.asList(data.split(spliter)));
		return buildTree(nodes);
	}

	private TreeNode buildTree(Deque<String> nodes) {
		String val = nodes.remove();
		if (val.equals(NN))
			return null;
		else {
			TreeNode node = new TreeNode(Integer.valueOf(val));
			node.left = buildTree(nodes);
			node.right = buildTree(nodes);
			return node;
		}
	}

}
