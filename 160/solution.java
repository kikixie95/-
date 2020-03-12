/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode dummyA = headA;
        ListNode dummyB = headB;
        
        while(dummyA != dummyB){
            if(dummyA != null){
                dummyA = dummyA.next;
            }else{
                dummyA = headB;
            }
            if(dummyB != null){
                dummyB = dummyB.next;
            }else{
                dummyB = headA;
            }
        }
        return dummyB;
    }
}