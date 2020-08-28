public class Solution {
    public int solve(String A) {
        int ans = 0;
        int n = A.length();
        for(int i=0; i<n; i++){
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o'
            || A.charAt(i) == 'u' || A.charAt(i) == 'A' || A.charAt(i) == 'E' || A.charAt(i) == 'I'
            || A.charAt(i) == 'O' || A.charAt(i) == 'U'){
                ans += n-i;
            }
        }
        return ans%10003;
    }
}
