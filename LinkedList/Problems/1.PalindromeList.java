/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;
        while(fast != null && fast. next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        ListNode nex = slow;
        while(curr != null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        ListNode start = A;
        while(prev != null){
            if(prev.val != start.val){
                return 0;
            }
            prev = prev.next;
            start = start.next;
        }
        return 1;
    }
}
