public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> hs = new HashSet<>(A);
        int count = 0;
        for(int i=0; i<A.size(); i++){
            if(hs.contains(A.get(i)^B)){
                count++;
            }
        }
        return count/2;
    }
}
