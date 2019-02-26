package linked_List;

/*make first element the head
 * each element is called node
 * every node has its address
 * one node has two parts -> info(content) and address of next node
 * tail node address is null
 * 
 * Advantage is that it is expandable but array is expandable
 * it is slow when compare with array bc array works worh index nos
 * O(n)- search
 */
public class LinkedList {
	Node head;

	/*
	 * insert at end create a node check if head is null-> if null then make node
	 * the head traverse through list till we reach end of head make null -> the
	 * node that we created
	 */
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	/*
	 * simply change head location head will become new element
	 * 
	 */
	public void insertAtStart(int data) {
		/*
		 * make a node
		 */
		Node node = new Node();
		// assign the data
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	/*
	 * create node
	 * 
	 */
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			// traverse if index is 2 we have to reach 1-> hence
			// index -1 because we have to change address of the node
			// before to the one that we are inserting
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			// change address of new node with that of previous node
			// if we r adding 2 in 1->3 (assign address of 1 to 2)
			// so 1->2->3
			node.next = n.next;
			// assign address of previous node to this node
			n.next = node;
		}
	}

	/*
	 * just change the address of the previous node
	 */
	public void deleteAt(int index) {
		// if first index, change head location
		if (index == 0) {
			head = head.next;
		} else {
			// traverse
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			// replace address of the node which is to be deleted with the previous node
			// if delete 2 from 1->2->3
			// replace address of 2 to 1 so 1->3
			n.next = n1.next;
			// System.out.println("n1 " + n1.data);
			// garbage collection
			n1 = null;
		}
	}

	public void show() {
		Node node = head;

		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
