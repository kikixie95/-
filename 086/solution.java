/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        
        ListNode head1 = dummy1;
        ListNode head2 = dummy2;
        
        ListNode pointer = head;
        
        while(pointer != null){
            if(pointer.val < x){
                dummy1.next = pointer;
                dummy1 = dummy1.next;
            }
            else{
                dummy2.next = pointer;
                dummy2 = dummy2.next;
            }
            
            pointer = pointer.next;
        }
        
        dummy1.next = head2.next;
        dummy2.next = null;
        return head1.next;
    }
}