/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
       if(head == null) return null;
       if(head.next == null) return head;
        
       ListNode mid = midNode(head);
       ListNode firstR = mid.next;
        mid.next = null;
        
       ListNode left = sortList(head);
       ListNode right = sortList(firstR);
        
       ListNode merge = mergeList(left,right);
        
        return merge;
     
    }
    
    public ListNode mergeList(ListNode left, ListNode right){
         ListNode sort = new ListNode(0);
        ListNode res = sort;
        while(left != null && right != null){
           
            if(left.val < right.val){
              sort.next = left;
                left = left.next;
                sort = sort.next;
            }
            else if(left.val >= right.val){
                sort.next = right;
                right = right.next;
                sort = sort.next;
            }
        }
        
        while (left != null){
            sort.next = left;
            left = left.next;
            sort = sort.next;
        }
        
        while ( right != null){
            sort.next = right;
            right = right.next;
            sort = sort.next;
        }
        sort.next = null;
        return res.next;
        
    }
    
    public ListNode midNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
        
    }
}