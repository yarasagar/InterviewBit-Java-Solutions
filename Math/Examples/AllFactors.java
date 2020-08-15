public class Solution {
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=1; i<=A; i++){
            if(A%i == 0)
                B.add(i);
        }
        return B;
    }
}
