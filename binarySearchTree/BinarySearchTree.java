/*
 * BST from my algorithm class/ used geekforgeeks.com for some Test main method reference  
 */
package binarySearchTree;

/*
 * Left sub tree of a BST contains nodes less than parent
 * right sub tree contains nodes greater than parents
 * No Duplicate nodes allowed 
 */

public class BinarySearchTree {

	Node root;

	/*
	 * calls insertInTree
	 */
	public void insert(int val) {
		root = insertInTree(root, val);
	}

	/*
	 * -> Always insertion is at the leaf if root is not empty-becomes child of leaf
	 * node start from root compare value which is to be inserted to the root if
	 * less then root traverse left if greater than traverse right
	 */
	public Node insertInTree(Node root, int val) {
		// if tree is empty, create new root
		if (root == null) {
			root = new Node(val);
			return root;
		}

		/*
		 * if not empty we traverse down the tree
		 */
		if (val < root.val) {
			root.left = insertInTree(root.left, val);
		}
		if (val > root.val) {
			root.right = insertInTree(root.right, val);
		}

		// return a node (reference)
		return root;

	}

	// calls searchInTree
	public void search(int val) {
		searchInTree(root, val);

	}

	/*
	 * Search in the tree We first compare the value with root, if val ==root we
	 * return root if value is greater than root.val we traverse right else traverse
	 * left
	 */
	public Node searchInTree(Node root, int val) {

		if (root == null) {

			System.out.println("value not in tree");
			return null;

		}
		if (root == null || root.val == val) {
			System.out.println(root.val);
			return root;
		}

		// if val is greater then root look for in the right
		else if (root.val < val) {
			// System.out.println(searchInTree(root.right, val));
			return searchInTree(root.right, val);
		}
		// if not then search for val in left
		else {
			// System.out.println(searchInTree(root.left, val));
			return searchInTree(root.left, val);
		}

	}

	// calls deleteInTree
	public void delete(int val) {
		root = deleteInTree(root, val);
	}

	/*
	 * used only if node has two child and has to be deleted
	 */
	public int minVal(Node root) {
		int min = root.val;
		while (root.left != null) {
			min = root.left.val;
			root = root.left;
		}
		return min;
	}

	/*
	 * Delete element from tree the deleted node is leaf- delete it from the tree
	 * the deleted node has one child- make child the node and delete child the
	 * deleted node has two child- look for minimum node in the right subtree with
	 * respect to the node to be deleted -> in-order successor (which is needed only
	 * if right child is not null)
	 */
	public Node deleteInTree(Node root, int val) {
		// if empty tree
		if (root == null) {
			System.out.println("-->>value " + val + " not in tree<<--");
			return root;
		}

		// traverse down the tree
		if (root.val < val) {
			root.right = deleteInTree(root.right, val);
		} else if (root.val > val) {
			root.left = deleteInTree(root.left, val);
		}

		// if val is same as root
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// if node has two children , look for successor and deleted min val
			root.val = minVal(root.right);
			root.right = deleteInTree(root.right, root.val);
		}
		return root;
	}

	/*
	 * print the traversal
	 * 
	 */
	public void printTree(Node root) {
		if (root != null) {
			printTree(root.left);
			System.out.print(root.val + ", ");
			printTree(root.right);
		}

	}

	public void print() {
		printTree(root);
	}

	// test method used from geeksfromgeeks.com
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.insert(90);

		System.out.println("Inorder traversal of the given tree");
		tree.print();

		System.out.println("\nSearch: 70");
		System.out.print("Searched value: ");
		tree.search(70);
		System.out.println("Inorder traversal of the modified tree");
		tree.print();

		System.out.println("\nDelete 20");
		tree.delete(20);
		System.out.println("Inorder traversal of the modified tree");
		tree.print();

		System.out.println("\nDelete 30");
		tree.delete(30);
		System.out.println("Inorder traversal of the modified tree");
		tree.print();

		System.out.println("\nDelete 50");
		tree.delete(50);
		System.out.println("Inorder traversal of the modified tree");
		tree.print();
	}

}
