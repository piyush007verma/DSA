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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = {-1 , -1};
        if(head.next==null || head.next.next==null)
        {
            return arr;
        }
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        int first = -1;
        int last = -1;
        int idx = 1;
        int mindist = Integer.MAX_VALUE;
        while(right!=null)
        {
            if((mid.val<left.val && mid.val<right.val )|| (mid.val>left.val && mid.val>right.val))
            {
                if(first==-1) first = idx;
                if(last!=-1)
                {
                    int dist = idx-last;
                    mindist = Math.min(dist , mindist);
                }
                last = idx;
            }
            left = left.next;
            mid = mid.next;
            right = right.next;
            idx++;
        }

        if(first==last) return arr;
        int maxdist = last-first;
        arr[0] = mindist;
        arr[1] = maxdist;

 
        return arr;
    }
}