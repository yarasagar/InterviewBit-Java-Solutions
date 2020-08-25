public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int n = A.size();
        int x = 0;
        for(int i=0; i<32; i++){
            int c = 0;
            int y = 1<<i;
            for(int j=0; j<n; j++){
                if((A.get(j)&y) == 0){
                    c++;
                }
            }
            if((c%3) == 0){
                x = x|y;
            }
        }
        return x;
    }
}
