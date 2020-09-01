public class Solution {
    public String reverseString(String A) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> s = new Stack<>();
        int n = A.length();
        for(int i=0; i<n; i++){
            s.push(A.charAt(i));
        }
        for(int i=0; i<n; i++){
            sb.append(s.peek());
            s.pop();
        }
        return sb.toString();
    }
}
