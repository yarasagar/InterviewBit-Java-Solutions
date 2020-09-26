/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        if(A == null || A.next == null)
            return A;
        ListNode C = A;
        ListNode D = A.next;
        int n = 0;
        while(C != null){
            n++;
            C = C.next;
        }
        B = B%n;
        C = A;
        int x = n-B-1;
        while(x > 0){
            x--;
            C = C.next;
            D = D.next;
        }
        C.next = null;
        C = D;
        if(D == null)
            return A;
        while(D.next != null){
            D = D.next;
        }
        D.next = A;
        A = C;
        return A;
    }
}
