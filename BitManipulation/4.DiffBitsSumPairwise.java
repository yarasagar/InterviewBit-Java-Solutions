public class Solution {
    public int cntBits(ArrayList<Integer> A) {
        int c = 0;
        for(int i=0; i<A.size(); i++){
            for(int j=i+1; j<A.size(); j++){
                int x = A.get(i)^A.get(j);
                for(int k=0; k<32; k++){
                    if((x&1) == 1){
                        c++;
                    }
                    x = x>>1;
                }
            }
        }
        return 2*c;
    }
}
