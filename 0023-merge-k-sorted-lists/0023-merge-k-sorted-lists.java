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
    public ListNode merge2list(ListNode a , ListNode b)
    {
        ListNode dummy = new ListNode(0);
        ListNode k = dummy;
        ListNode i = a;
        ListNode j = b;
        while(i!=null && j!=null)
        {
            if(i.val<=j.val)
            {
                k.next = i;
                i = i.next;
            }
            else
            {
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null)
        {
            k.next = j;
        }
        if(j==null)
        {
            k.next = i;
        }

        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
        {
            return null;
        }
        return mergehelper(lists , 0 , lists.length-1);
    }

    public ListNode mergehelper(ListNode[] lists , int start , int end)
    {
        if(start==end) return lists[start];
        if(start+1 == end) return merge2list(lists[start] , lists[end]);

        int mid = start + (end-start)/2;
        ListNode left = mergehelper(lists , start , mid);
        ListNode right = mergehelper(lists , mid+1 , end);
        return merge2list(left , right);
    }
}