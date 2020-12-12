public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> B = new ArrayList<>();
        int cs = 0;
        int rs = 0;
        int ce = A.get(0).size()-1;
        int re = A.size()-1;
        while(cs <= ce && rs <= re){
            for(int i=cs; i<=ce; i++){
                B.add(A.get(rs).get(i));
            }
            rs++;
            for(int i=rs; i<=re; i++){
                B.add(A.get(i).get(ce));
            }
            ce--;
            if(cs <= ce && rs <= re){
                for(int i=ce; i>=cs; i--){
                    B.add(A.get(re).get(i));
                }
                re--;
                for(int i=re; i>=rs; i--){
                    B.add(A.get(i).get(cs));
                }
                cs++;
            }
        }
        return B;
    }
}
