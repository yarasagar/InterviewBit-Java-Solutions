public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int r = 0;
        for(int i=0; i<n; i++){
            int f = (i+1)*(n-i);
            if(f%2 == 1){
                r = r^A[i];
            }
        }
        return r;
    }
}
