/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode C = new ListNode(0);
        ListNode D = C;
        while(A != null && B != null){
            if(A.val <= B.val){
                D.next = A;
                A = A.next;
            }else{
                D.next = B;
                B = B.next;
            }
            D = D.next;
        }
        while(A != null){
            D.next = A;
            A = A.next;
            D = D.next;
        }
        while(B != null){
            D.next = B;
            B = B.next;
            D = D.next;
        }
        return C.next;
    }
}
