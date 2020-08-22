public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int findCount(final List<Integer> A, int B) {
        int c = 0;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) == B){
                c++;
            }
        }
        return c;
    }
}
