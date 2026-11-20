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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            n++;
        }
        int size = n/k;
        int extra = n%k;
        ListNode[] ans = new ListNode[k];
        int i = 0;
        temp = head;
        int len = 1;
        while(temp!=null)
        {
            int s = size;
            if(extra>0) s++;
            if(len==1) ans[i++] = temp;
            if(len==s)
            {
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
                extra--;
                len=1;
            }
            else
            {
                temp = temp.next;
                len+=1;
            }
        }

        return ans;
    }
}