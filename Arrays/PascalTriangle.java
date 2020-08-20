public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> C = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<A; i++){
            ArrayList<Integer> B = new ArrayList<>();
            for(int j=0; j<=i ; j++){
                if(j == 0){
                    B.add(1);
                }else if(i == j){
                    B.add(1);
                }else{
                    int x = B.get(j-1)*(i-j+1)/j;
                    B.add(x);
                }
            }
                C.add(B);
        }
        return C;
    }
}
