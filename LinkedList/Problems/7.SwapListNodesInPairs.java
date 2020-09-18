public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode temp = A; 
        while (temp != null && temp.next != null) { 
            int k = temp.val; 
            temp.val = temp.next.val; 
            temp.next.val = k; 
            temp = temp.next.next; 
        }
        return A;
    }
}
