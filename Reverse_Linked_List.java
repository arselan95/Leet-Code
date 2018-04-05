/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode p,q;
        if(head==null)
        {
            return null;
        }
        p=head;
        q=p.next;
        
        if(q==null)
        {
            return p;
        }
        q=reverseList(q);
        p.next.next=p;
        p.next=null;
        
        return q;
        
        
    }
}