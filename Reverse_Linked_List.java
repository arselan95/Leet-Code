/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
Reverse a singly linked list.
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        
        /*
            go to the end of the linked list and revert the pointers
            
        */
        
        ListNode p,q;
        if(head==null)
        {
            return null;
        }
        p=head;
        q=p.next;
        
       //if list only consist of head node
        if(q==null)
        {
            return p;
        }
        q=reverseList(q);
        
        //after all recursion is done -> reverse pointers
        p.next.next=p;
        p.next=null;
        
        return q;
        
        
    }
}
