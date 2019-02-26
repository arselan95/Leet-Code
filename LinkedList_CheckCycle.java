import java.util.HashSet;

/*
 * check for Linked List Cycle
 */

//mark the visited nodes
//if cycle we r gonna revisit the repeated node
//so hashset bc contains method
//linear time O(N) time and space
public class LinkedList_CheckCycle {

	/*
	 * public boolean checkCycle(ListNode n) { // make a hashset HashSet<ListNode>
	 * visited = new HashSet<ListNode>();
	 * 
	 * for (ListNode curr = n; curr != null; curr = curr.next) { if
	 * (visited.contains(curr)) { return true; } visited.add(curr); } return false;
	 * }
	 * 
	 */

	// floyds algo
	/*
	 * slow and a fast pointer O(N) time and constant space THEY WILL ALWAYS MEET AT
	 * SOME POINT
	 */

	public boolean checkcycle(ListNode n) {
		if (n == null)
			return false;
		ListNode slow = n;
		ListNode fast = n.next;

		while (fast != null && fast.next != null) {

			if (fast == slow)
				return true;
			fast = fast.next.next;
			slow = slow.next;
		}
		return false;
	}
}
