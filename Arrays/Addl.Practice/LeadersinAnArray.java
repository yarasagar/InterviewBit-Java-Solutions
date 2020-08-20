public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        if(A.size() == 0)
            return new ArrayList<>();
        int m = A.get(A.size()-1);
        B.add(m);
        for(int i=A.size()-2; i>=0; i--){
            if(A.get(i) > m){
                m = A.get(i);
                B.add(m);
            }
        }
        return B;
    }
}
