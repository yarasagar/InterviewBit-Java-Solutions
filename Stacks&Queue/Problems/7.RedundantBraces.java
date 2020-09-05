public class Solution {
    public int braces(String A) {
        Stack<Character> s = new Stack<>();
        int n = A.length();
        for(int i=0; i<n; i++){
            if(A.charAt(i) == ')'){
                boolean flag = true;
                char top = s.pop();
                while(top != '('){
                    if(top == '+' || top == '-' || top == '*' || top == '/')
                        flag = false;
                    top = s.pop();
                }
                if(flag == true)
                    return 1;
            }else{
                s.push(A.charAt(i));
            }
        }
        return 0;
    }
}
