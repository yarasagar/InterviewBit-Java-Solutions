public class Solution {
    public int isValid(String A) {
        Stack<Character> s = new Stack<>();
        int n = A.length();
        for(int i=0; i<n; i++){
            if(A.charAt(i) == ')' || A.charAt(i) == '}' || A.charAt(i) == ']'){
                if(s.empty()){
                    return 0;
                }else if(A.charAt(i) == ')'){
                    if(s.peek() == '('){
                        s.pop();
                    }else{
                        return 0;
                    }
                }else if(A.charAt(i) == '}'){
                    if(s.peek() == '{'){
                        s.pop();
                    }else{
                        return 0;
                    }
                }else if(A.charAt(i) == ']'){
                    if(s.peek() == '['){
                        s.pop();
                    }else{
                        return 0;
                    }
                }
            }else{
                s.push(A.charAt(i));
            }
        }
        if(s.empty()){
            return 1;
        }
        return 0;
    }
}
