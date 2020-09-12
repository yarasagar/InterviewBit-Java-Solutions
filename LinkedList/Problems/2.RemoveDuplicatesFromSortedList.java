/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode B = A;
        if(A == null || A.next == null)
            return A;
        while(B.next != null){
            if(B.val == B.next.val){
                B.next = B.next.next;
            }else{
                B = B.next;
            }
        }
        return A;
    }
}
