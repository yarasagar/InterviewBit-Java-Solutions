public class Solution {
    public int solve(int A) {
        A = Math.abs(A);
        int sum=0, step=0;
        while(sum < A || (sum-A)%2 != 0){
            step++;
            sum = sum+step;
        }
        return step;
    }
}
