/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) {
        ListNode slow = A;
        ListNode fast = A;
        int x = 0;
        while(fast != null && fast.next != null){
            x++;
            slow = slow.next;
            fast = fast.next.next;
        }
        int C = x-B;
        if(C < 0)
            return -1;
        else{
            ListNode D = A;
            while(C > 0){
                D = D.next;
                C--;
            }
            return D.val;
        }
    }
}
