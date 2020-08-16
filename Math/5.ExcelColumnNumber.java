public class Solution {
    public int titleToNumber(String A) {
        StringBuilder sb = new StringBuilder(A);
        int sum = 0;
        while(sb.length() != 0){
            int c = sb.charAt(0)-64;
            sum = 26*sum + c;
            sb.deleteCharAt(0);
        }
        return sum;
    }
}
