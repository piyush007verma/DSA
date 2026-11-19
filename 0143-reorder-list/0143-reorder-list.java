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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prevofslow = head;
        while(fast!=null && fast.next!=null)
        {
            prevofslow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reversedhalf = reverse(slow);
        prevofslow.next = null;
        ListNode dummy = new ListNode(-1);
        ListNode t1 = head;
        ListNode t2 = reversedhalf;
        ListNode temp = dummy;
        while(t2!=null && t1!=null)
        {
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;
            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        }
        head = dummy.next;

    }
}