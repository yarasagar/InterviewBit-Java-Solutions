public class Solution {
    public long reverse(long a) {
        long b = ((a&1) == 1?1:0);
        a = a>>1;
        for(long i=1; i<32; i++){
            long c = ((a&1) == 1?1:0);
            b = b*2+c;
            a = a>>1;
        }
        return b;
    }
}
