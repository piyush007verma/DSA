/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode heada, ListNode headb) {
        int len1 = 0;
        int len2 = 0;
        ListNode temp = heada;
        while(temp!=null)
        {
            temp = temp.next;
            len1++;
        }
        temp = headb;
         while(temp!=null)
        {
            temp = temp.next;
            len2++;
        }
        ListNode first = heada;
        ListNode second = headb;
        if(len1>=len2)
        {   
            for(int i=1;i<=len1-len2;i++)
            {
                first = first.next;
            }
        }
        
        else
        {
             for(int i=1;i<=len2-len1;i++)
            {
                second= second.next;
            }
        }

        while(first!=second)
        {
            first = first.next;
            second = second.next;
        }

        return first;

    }
}