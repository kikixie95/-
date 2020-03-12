 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        
        while(cur.next!=null ){
           ListNode tmp = cur.next;
            if(tmp.next == null) break;
            cur.next = cur.next.next;
            tmp.next = cur.next.next;
             cur.next.next = tmp;
            cur = cur.next.next;
        }
        return dummy.next;
        
    }
    
}