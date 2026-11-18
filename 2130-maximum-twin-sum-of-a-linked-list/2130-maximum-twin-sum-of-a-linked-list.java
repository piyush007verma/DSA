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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode i = head;
        ListNode j = reverse(slow);
        int mx = -1;
        while(j!=null)
        {
            if(i.val + j.val > mx)
            {
                mx = i.val + j.val;
            }
            i = i.next;
            j = j.next;
        }

        return mx;

    }
}