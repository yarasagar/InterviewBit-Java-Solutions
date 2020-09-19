/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        ListNode B = new ListNode(0);
        ListNode B1 = B;
        ListNode C = new ListNode(0);
        ListNode C1 = C;
        while(A != null){
            C1.next = new ListNode(A.val);
            C1 = C1.next;
            A = A.next;
            if(A != null){
                B1.next = new ListNode(A.val);
                B1 = B1.next;
                A = A.next;
            }
        }
        B = B.next;
        C = C.next;
        B = rev(B);
        ListNode D = new ListNode(0);
        ListNode D1 = D;
        while(B != null && C != null){
            D1.next = new ListNode(C.val);
            D1 = D1.next;
            D1.next = new ListNode(B.val);
            D1 = D1.next;
            B = B.next;
            C = C.next;
        }
        if(C != null)
            D1.next = new ListNode(C.val);
        return D.next;
    }
    public ListNode rev(ListNode B){
        ListNode prev = null;
        ListNode curr = B;
        ListNode nex = B;
        while(curr != null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
}
