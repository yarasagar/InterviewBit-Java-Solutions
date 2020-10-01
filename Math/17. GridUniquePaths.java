public class Solution {
    public int uniquePaths(int A, int B) {
        int[][] c = new int[A][B];
        for(int i=0; i<A; i++){
            c[i][0] = 1;
        }
        for(int i=0; i<B; i++){
            c[0][i] = 1;
        }
        for(int i=1; i<A; i++){
            for(int j=1; j<B; j++){
                c[i][j] = c[i][j-1]+c[i-1][j];
            }
        }
        return c[A-1][B-1];
    }
}
