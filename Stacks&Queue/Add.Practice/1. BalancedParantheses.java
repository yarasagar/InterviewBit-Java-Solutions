public class Solution {
    public int solve(String A) {
        int n = A.length();
        Stack<Character> s = new Stack<>();
        for(int i=0; i<n; i++){
            if(A.charAt(i) == '('){
                s.push(A.charAt(i));
            }else if(s.empty()){
                return 0;
            }else if(A.charAt(i) == ')'){
                if(s.peek() == '('){
                    s.pop();
                }
            }
        }
        return s.empty()==true?1:0;
    }
}
