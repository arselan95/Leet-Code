/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        
        ListNode sorted=null;
            ListNode newhead=null;
        
        if(l1==null)
            return l2;
        
        if(l2==null)
            return l1;
        
        if(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                sorted=l1;
                l1=sorted.next;
            }
            else{
                sorted=l2;
                    l2=sorted.next;
            }
        }
        newhead=sorted;
        while(l1!=null && l2!=null)
        {
            if(l1.val<= l2.val)
            {
                sorted.next=l1;
                sorted=l1;
                l1=sorted.next;
            }
            else{
                sorted.next=l2;
                sorted=l2;
                l2=sorted.next;
            }
        }
        if(l1==null)
        {
            sorted.next=l2;
        }
        if(l2==null)
        {
            sorted.next=l1;
        }
        return newhead;
        
        
        
    }
}