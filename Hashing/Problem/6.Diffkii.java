public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B) {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<A.size(); i++){
            if(s.contains(A.get(i)+B) || s.contains(A.get(i)-B)){
                return 1;
            }else{
                s.add(A.get(i));
            }
        }
        return 0;
    }
}
