public class Solution {
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(A); i++){
            if(A%i == 0){
                if(A/i == i)
                    B.add(i);
                else{
                    B.add(i);
                    B.add(A/i);
                }
            }
        }
        Collections.sort(B);
        return B;
    }
}
