/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807
 */
public class LinkedList_AddTwoNumbers {

	/*
	 * we need one more linked list to show the result
	 * 
	 * linked list is linear data structure
	 * 
	 * we need 3 pointers for three lists
	 * 
	 * int carry to store carry value
	 * 
	 * dummy node refer to head of result list ( we can use dummy.next)
	 * 
	 * edge case: both lists are same size another if result is greater
	 */

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		// linked to head to result linked list
		ListNode dummy = new ListNode(0);

		ListNode l3 = dummy;
		// carry bit
		int carry = 0;

		// %10 because : 12+9=21 where 2+9=11 and 11%10 =1 (we only need to keep ones
		// bit)
		while (l1 != null && l2 != null) {
			int digitValue = (l1.val + l2.val + carry) % 10;
			carry = (l1.val + l2.val + carry) / 10;

			ListNode newNode = new ListNode(digitValue);

			// update result list
			l3.next = newNode;
			l3 = newNode;

			// move forward with summation process
			l1 = l1.next;
			l2 = l2.next;
		}

		// if only one linkedlist
		while (l1 != null) {
			int digitValue = (l1.val + carry) % 10;
			carry = (l1.val + carry) / 10;
			ListNode newNode = new ListNode(digitValue);
			l3.next = newNode;
			l3 = newNode;
			l1 = l1.next;
		}
		// if only one linkedlist
		while (l2 != null) {
			int digitValue = (l2.val + carry) % 10;
			carry = (l2.val + carry) / 10;
			ListNode newNode = new ListNode(digitValue);
			l3.next = newNode;
			l3 = newNode;
			l2 = l2.next;
		}

		// when done
		if (carry != 0) {
			ListNode newNode = new ListNode(carry);
			l3.next = newNode;
			l3 = newNode;
		}
		return dummy.next;
	}

}
