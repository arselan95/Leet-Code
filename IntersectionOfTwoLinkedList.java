/*
 * Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:


begin to intersect at node c1.


Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
Output: Reference of the node with value = 8
Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
 From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. 
 There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 */
public class IntersectionOfTwoLinkedList {

	/*
	 * We can use two iterations to do that.
	 * 
	 * In the first iteration, we will reset the pointer of one linkedlist to the
	 * head of another linkedlist after it reaches the tail node.
	 * 
	 * In the second iteration, we will move two pointers until they points to the
	 * same node. Our operations in first iteration will help us counteract the
	 * difference.
	 * 
	 * So if two linkedlist intersects, the meeting point in second iteration must
	 * be the intersection point.
	 * 
	 * If the two linked lists have no intersection at all, then the meeting pointer
	 * in second iteration must be the tail node of both lists, which is null
	 */

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		// boundary check
		if (headA == null || headB == null)
			return null;

		ListNode a = headA;
		ListNode b = headB;

		// if a & b have different len, then we will stop the loop after second
		// iteration
		while (a != b) {
			// for the end of first iteration, we just reset the pointer to the head of
			// another linkedlist
			
			//variable x = (expression) ? value if true : value if false
			// b = (a == 1) ? 20: 30;
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}

		return a;

	}

}
