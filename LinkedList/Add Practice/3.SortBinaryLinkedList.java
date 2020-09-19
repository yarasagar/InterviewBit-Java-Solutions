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
        ListNode B = A;
        int coun = 0;
        while(B != null){
            if(B.val == 0)
            coun++;
            B = B.next;
        }
        ListNode C = A;
        while(coun > 0){
            C.val = 0;
            C = C.next;
            coun--;
        }
        while(C != null){
            C.val = 1;
            C = C.next;
            coun--;
        }
        return A;
    }
}
