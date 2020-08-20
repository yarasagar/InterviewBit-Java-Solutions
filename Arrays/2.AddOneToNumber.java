public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        int n = A.size();
        int j=0;
        while(A.get(j) == 0){
            A.remove(0);
            n--;
            if(n == 0){
                B.add(1);
                return B;
            }
        }
        int r = 1;
        for(int i=n-1; i>=0; i--){
            int x = A.get(i)+r;
            B.add(x%10);
            r = x/10;
        }
        if(r == 1)
            B.add(r);
        Collections.reverse(B);
        return B;
    }
}
