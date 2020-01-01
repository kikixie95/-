/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Hashset
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
                head = head.next;
            }
        }
        return false;
        
    }
}

// two pointers
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode slow = new ListNode(0);
        ListNode fast = slow;
        slow.next = head;
        
        fast = fast.next;
        
       while(fast != slow){
           if(fast == null || fast.next == null) return false;
           fast = fast.next.next;
           slow = slow.next;
       }
        return true;
        
    }
}
