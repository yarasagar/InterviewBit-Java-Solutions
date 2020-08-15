public class Solution {
    public ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=2; i<A; i++){
            int j=2;
            for(; j<i; j++){
                if(i%j == 0)
                    break;
            }
            if(j == i)
                B.add(i);
        }
        return B;
    }
}
