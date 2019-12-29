/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur  = dummy;
        dummy.next = l1;
        int sum = 0, carry = 0;
        
        
        while(l1!= null && l2 != null){
            sum = l1.val + l2.val + carry;
            int num = sum % 10;
            carry = sum / 10;
            
            l1.val = num;
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }
        
        while(l1 != null){
            sum = l1.val + carry;
            int num = sum % 10;
            carry = sum / 10;
            
            l1.val = num;
            l1 = l1.next;
            cur = cur.next;
        }
        
         while(l2 != null){
             cur.next = l2;
            sum = l2.val + carry;
            int num = sum % 10;
            carry = sum / 10;
            
            l2.val = num;
             cur = cur.next;
            l2 = l2.next;

            
           
         }
        
        if(carry != 0){
            ListNode add = new ListNode(carry);
            cur.next = add;
        }
        return dummy.next;
        
    }
}