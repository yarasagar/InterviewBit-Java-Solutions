public class Solution {
    public int gcd(int A, int B) {
        if(A > B){
            swap(A,B);
        }
        while(A != 0){
            int C = A;
            A = B%A;
            B = C;
        }
        return B;
    }
    public void swap(int A, int B){
        int C = A;
        A = B;
        B = C;
    }
}
