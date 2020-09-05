public class Solution {
    public int[] nextGreater(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(s.empty()){
                B[i] = -1;
                s.push(A[i]);
            }else{
                while(!s.empty() && s.peek() <= A[i]){
                    s.pop();
                }
                if(s.empty()){
                    B[i] = -1;
                    s.push(A[i]);
                }else{
                    B[i] = s.peek();
                    s.push(A[i]);
                }
            }
        }
        return B;
    }
}
