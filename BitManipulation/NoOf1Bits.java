public class Solution {
    public int numSetBits(long a) {
        int c = 0;
        for(int i=0; i<32; i++){
            if((a&1) == 1){
                c++;
            }
            a = a>>1;
        }
        return c;
    }
}
