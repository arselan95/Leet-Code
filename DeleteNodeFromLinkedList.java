
public class DeleteNodeFromLinkedList {

	/*
	 * Input: head = [4,5,1,9], node = 5 Output: [4,1,9] Explanation: You are given
	 * the second node with value 5, the linked list should become 4 -> 1 -> 9 after
	 * calling your function.
	 */

	ListNode head;

	public void deleteNode(ListNode node) {

		// change value
		// 1->2->3->4->5
		// if we delete 3 assign value 4 to 3
		node.val = node.next.val;
		// change address
		// 3 (which is 4 now) -> is directed to 5 first it was directed to 4
		node.next = node.next.next;

	}

}
