/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        ListNode res  = new ListNode(0);
        res.next = mergeTwo(lists[0],lists[1]);
        for(int i = 2; i < lists.length; i ++){
            res.next = mergeTwo(res.next,lists[i]);
        }
        return res.next;
    }
    
    
    public ListNode mergeTwo(ListNode a, ListNode b){
        ListNode dummy  = new ListNode(0);
        ListNode curr = dummy;
        while(a != null && b != null){
        if(a.val <= b.val){
            curr.next = a;
            curr = curr.next;
            a = a.next;
        }
        else{
            curr.next = b;
            curr = curr.next;
            b = b.next;
        }
        }
            if(a != null){
                curr.next = a;
            }
            if(b != null){
                curr.next = b;
            }
        return dummy.next;
    }
}