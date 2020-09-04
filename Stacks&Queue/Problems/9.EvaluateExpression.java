public class Solution {
    public int evalRPN(String[] A) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<A.length; i++){
            if("+".equals(A[i]) || "-".equals(A[i]) || "*".equals(A[i]) || "/".equals(A[i])){
                int C = s.pop();
                int B = s.pop();
                if("+".equals(A[i]))
                    s.push(B+C);
                else if("-".equals(A[i]))
                    s.push(B-C);
                else if("*".equals(A[i]))
                    s.push(B*C);
                else if("/".equals(A[i]))
                    s.push(B/C);
            }else{
                s.push(Integer.parseInt(A[i]));
            }
        }
        return s.pop();
    }
}
