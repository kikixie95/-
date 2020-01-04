/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode pointer = head;

        if(head == null) return null;
        if(k == 0 || head.next == null ) return head;
        
        //check the length of the linked list
        int length = 1;
        while(pointer.next != null){
            pointer = pointer.next;
            length ++;
        }
        if(k % length == 0) return head;
        pointer.next = head;
        ListNode fast = head;
        ListNode slow = head;
        
        k = length - k % length;
        
        while(k > 0){
            slow = fast;
            fast = fast.next;
            k--;
        }
        
  
        slow.next = null;
       
        return fast;
        
        }
       
    }
