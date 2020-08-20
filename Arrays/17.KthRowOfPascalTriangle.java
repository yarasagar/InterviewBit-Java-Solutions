public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> B = new ArrayList<>();
        int c = 1;
        B.add(c);
        for(int i=1; i<=A; i++){
            c=c*(A-i+1)/i;
            B.add(c);
        }
        return B;
    }
}
