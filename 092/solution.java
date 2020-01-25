/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        if(head.next == null) return head;
 
        
        ListNode cur = new ListNode(0);
        ListNode dummy = cur;
        cur.next = head;
        ListNode pre  = null;
        
        while(m > 0){
            pre  = cur;
            cur = cur.next;
            m--;
            n--;
        }
        
        ListNode start = pre;
         ListNode tail = cur;
        while(cur != null && n >= 0){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
            n--;
        }
        if(start != dummy ){
            start.next = pre;
             tail.next = cur;
             
        }else{
            head = pre;
            tail.next = cur;
          
        }
         // System.out.println(start.val);
        return head ;
        
        }
    }
