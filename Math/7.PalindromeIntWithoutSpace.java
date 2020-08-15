public class Solution {
    public int isPalindrome(int A) {
        int d = 1;
        if(A < 0)
            return 0;
        while(A/d >= 10){
            d = d*10;
        }
        while(A != 0){
            if(A%10 == A/d){
                A = (A%d)/10;
                d = d/100;
            }else{
                return 0;
            }
        }
        return 1;
    }
}
