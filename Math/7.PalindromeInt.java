public class Solution {
    public int isPalindrome(int A) {
        int C = A;
        if(A < 0)
            return 0;
        int B = 0;
        while(A != 0){
            B = B*10+A%10;
            A = A/10;
        }
        if(B == C)
            return 1;
        else
            return 0;
    }
}
