public class Solution {
    public int solve(int A) {
        return steps(0,0,A);
    }
    public int steps(int source, int step, int dest){
        if(Math.abs(source) > dest)
            return Integer.MAX_VALUE;
        if(source == dest)
            return step;
        int pos = steps(source+step+1,step+1,dest);
        int neg = steps(source-step-1,step+1,dest);
        return Math.min(pos,neg);
    }
}
