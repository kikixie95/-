/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return null;
        // if(head.next == null) return head;
        
        ListNode q= head.next;
        ListNode p ;
        while(q != null){
            p = head;
             while(q != null && q != p && q.val > p.val){
                p = p.next;

            }
            while(q != null && q != p && q.val <= p.val){
                int tmp = p.val;
                p.val = q.val;
                q.val = tmp;
                p = p.next;

            }
           
            q = q.next;
        }
        return head;
    }
}