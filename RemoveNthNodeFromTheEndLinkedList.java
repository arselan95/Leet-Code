
/**
 * Given a linked list, remove the n-th node from the end of list and return its
 * head.
 * 
 * Example:
 * 
 * Given linked list: 1->2->3->4->5, and n = 2.
 * 
 * After removing the second node from the end, the linked list becomes
 * 1->2->3->5.
 * 
 * @author Arselan
 *
 */
public class RemoveNthNodeFromTheEndLinkedList {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		if (n <= 0) {
			return head;
		}

		// we need to modify previous node before the actual nth delete node
		// real modification is before nth node so we need a node before head
		// only on direction
		ListNode follower = new ListNode(0);

		// distance between follower and head = distance of real follower
		follower.next = head;
		ListNode curr = follower;

		// move both pointer togethter till head is null
		for (int i = 0; i < n; i++) {
			if (head == null) {
				return null;
			}
			head = head.next; // trying to create gab n between two pointers
		}

		// move both pointer together till we reach to end
		while (head != null) {
			curr = curr.next;
			head = head.next;
		}

		// time to change,point to the next node of the delete node so nth node is
		// deleted
		curr.next = curr.next.next;
		return follower.next;

	}

}
