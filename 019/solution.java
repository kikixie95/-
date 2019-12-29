/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode h
        ead, int n) {
        
        
        ListNode dummy = new ListNode(0);
        ListNode fast = dummy;
        ListNode slow = dummy;
        dummy.next = head;
      
        while(n >= 0){
            fast = fast.next;
            n--;
            // System.out.println(fast.val);
        }
        
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
            
           
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}