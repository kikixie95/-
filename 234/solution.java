/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        ListNode prev = null;
        ListNode next = null;
        
        while(slow!= null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        slow = prev;
        while(slow != null){
            if(slow.val != head.val){
                return false;
            }else{
                slow = slow.next;
                head = head.next;
            }
        }

       return true;
  
    }
}