/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right) return head;

        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        ListNode d = null;
        ListNode temp = head;
        int count = 1;
        while(temp!= null)
        {
            if(count==left-1)
            {
                a = temp;
            }
            else if(count==left)
            {
                b = temp;
            }
            else if(count==right)
            {
                c = temp;
            }
            else if(count==right+1)
            {
                d = temp;
            }
            temp = temp.next;
            count+=1;
        }
       if(a!=null) a.next = null; // head to a left part 
       if(c!=null) c.next = null; // b to c is part to reverse
        // d to null is right part 
        ListNode rev = reverse(b);
        if(a!=null)  a.next = c;
        b.next = d;
        if(a==null) return c;
        return head;

    }
}