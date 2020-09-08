public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = -1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=A.size()-1; i>=0; i--){
            if(hs.contains(A.get(i))){
                n = A.get(i);
            }else{
                hs.add(A.get(i));
            }
        }
        return n;
    }
}
