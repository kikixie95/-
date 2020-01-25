/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode flag = null;
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode dummy = res;
        
        while(res.next != null ){
            if(res.next.next != null && res.next.val == res.next.next.val){
              flag = res.next;
                res.next = res.next.next;
            }else if (flag != null && flag.val == res.next.val){
                res.next = res.next.next; 
            }
            else{
                res = res.next;
            }
        }
        return dummy.next;
    }
}