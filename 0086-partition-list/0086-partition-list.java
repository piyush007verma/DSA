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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(0);
        ListNode ptr1 = a;
        ListNode ptr2 = b;
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                ptr1.next = temp;
                ptr1 = ptr1.next;
            }
            else
            {
                ptr2.next = temp;
                ptr2 = ptr2.next;
            }
            temp = temp.next;
        }
        ptr2.next = null;
        a = a.next;
        b = b.next;
        if(a==null) return b;
        ptr1.next = b;
        return a;
    }
}