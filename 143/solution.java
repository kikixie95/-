/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
     public void reorderList(ListNode head) {
       int length = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(dummy.next != null){
            dummy = dummy.next;
            length++;
        }
         
       if(length <= 2)  return;
        
        ListNode headEnd = head;
        for(int i = 0; i < length/2; i++){
            headEnd = headEnd.next;
            
        }
        ListNode tail= headEnd;
        headEnd = headEnd.next;
        tail.next = null;
       
       
          
         
         // reverse second half of the linked list
         
         ListNode pre = null;
         while(headEnd != null){
             ListNode temp = headEnd.next;
             headEnd.next = pre;
             pre = headEnd;
             headEnd = temp;
            
         }  
         headEnd = pre;
         
         //join two lists
         
       
         ListNode head1 = head;
         ListNode head2 = headEnd;
         
         while(head2!= null){
             ListNode next1 = head1.next;
             ListNode next2 = head2.next;
             
             head1.next = head2;
             head2.next = next1;
             
             head1 = next1;
             head2 = next2;
         }
        
    }
}

    

   
  